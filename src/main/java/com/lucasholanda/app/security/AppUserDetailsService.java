package com.lucasholanda.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lucasholanda.app.dto.UserLoginDTO;
import com.lucasholanda.app.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService
{
   
   private final UserRepository repository;
   
   @Autowired
   public AppUserDetailsService(UserRepository repository)
   {
      this.repository = repository;
   }

   @Override
   public UserDetails loadUserByUsername(String login)
   {
      UserLoginDTO entity = repository.findByLogin(login);

      if (entity == null)
      {
         throw new UsernameNotFoundException(login);
      }
      
      return new AppUserDetails(entity, null, true);
   }

}
