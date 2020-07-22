package com.lucasholanda.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "USR")
@Proxy(lazy = true)
public class UserEntity implements Serializable
{
   
   private static final long serialVersionUID = 6359109992803201653L;

   @Id
   @Column(name = "ID", updatable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)  
   private Long id;

   @Column(name = "NAME")
   private String name;
   
   @Column(name = "LOGIN")
   private String login;
   
   @Column(name = "PASSWORD")
   private String password;

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getLogin()
   {
      return login;
   }

   public void setLogin(String login)
   {
      this.login = login;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }
   
}
