package com.lucasholanda.app.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lucasholanda.app.dto.UserLoginDTO;

public class AppUserDetails implements UserDetails
{

   private static final long serialVersionUID = -119525700066995907L;

   private UserLoginDTO user;
   
   private Boolean enabled;
   
   private List<GrantedAuthority> listAuthorities;
   
   public AppUserDetails()
   {
   }
   
   public AppUserDetails(UserLoginDTO user, List<GrantedAuthority> listAuthorities, Boolean enabled)
   {
      super();
      this.enabled = enabled;
      this.user = user;
      this.listAuthorities = listAuthorities;
   }

   @Override
   public Collection<? extends GrantedAuthority> getAuthorities()
   {
      return this.listAuthorities;
   }

   @Override
   public String getPassword()
   {
      return this.getUser().getPassword();
   }

   @Override
   public String getUsername()
   {
      return this.getUser() != null ? this.getUser().getLogin() : null;
   }

   @Override
   public boolean isAccountNonExpired()
   {
      return true;
   }

   @Override
   public boolean isAccountNonLocked()
   {
      return true;
   }

   @Override
   public boolean isCredentialsNonExpired()
   {
      return true;
   }

   @Override
   public boolean isEnabled()
   {
      return this.enabled;
   }

   public UserLoginDTO getUser()
   {
      return user;
   }

   public void setUser(UserLoginDTO user)
   {
      this.user = user;
   }

}
