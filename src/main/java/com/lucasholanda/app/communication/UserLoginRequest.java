package com.lucasholanda.app.communication;

import io.swagger.annotations.ApiModelProperty;

public class UserLoginRequest
{

   @ApiModelProperty(value = "User login")
   private String login;
   
   @ApiModelProperty(value = "User password")
   private String password;
   
   /**
    * 
    */
   public UserLoginRequest()
   {
      super();
   }

   /**
    * @param login
    * @param password
    */
   public UserLoginRequest(String login, String password)
   {
      super();
      this.login = login;
      this.password = password;
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
