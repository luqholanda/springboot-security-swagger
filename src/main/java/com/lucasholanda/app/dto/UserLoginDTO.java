package com.lucasholanda.app.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Lucas Holanda
 * @author lucasholanda.com
 * @version 1.00
 * @since 1.0
 */
public class UserLoginDTO implements Serializable
{

   private static final long serialVersionUID = -2491821272900553882L;

   @ApiModelProperty(value = "Id Field")
   private Long id;
   
   @ApiModelProperty(value = "Name Field")
   private String name;
   
   @ApiModelProperty(value = "Login Field")
   private String login;
   
   @ApiModelProperty(value = "Password Field")
   private String password;
   
   /**
    * 
    */
   public UserLoginDTO()
   {
      super();
   }

   /**
    * @param id
    * @param name
    * @param login
    */
   public UserLoginDTO(Long id, String name, String login, String password)
   {
      super();
      this.id = id;
      this.name = name;
      this.login = login;
      this.password = password;
   }

   /**
    * @return the id
    */
   public Long getId()
   {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(Long id)
   {
      this.id = id;
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return the login
    */
   public String getLogin()
   {
      return login;
   }

   /**
    * @param login the login to set
    */
   public void setLogin(String login)
   {
      this.login = login;
   }

   /**
    * @return the password
    */
   public String getPassword()
   {
      return password;
   }

   /**
    * @param password the password to set
    */
   public void setPassword(String password)
   {
      this.password = password;
   }
   
}
