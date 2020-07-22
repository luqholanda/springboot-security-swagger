package com.lucasholanda.app.communication;

import io.swagger.annotations.ApiModelProperty;

public class UserLoginResponse
{

   @ApiModelProperty(value = "User ID")
   private Long id;

   @ApiModelProperty(value = "User name")
   private String name;
   
   @ApiModelProperty(value = "User login")
   private String login;
   
   /**
    * @param id
    * @param name
    * @param login
    */
   public UserLoginResponse(Long id, String name, String login)
   {
      super();
      this.id = id;
      this.name = name;
      this.login = login;
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

   
}
