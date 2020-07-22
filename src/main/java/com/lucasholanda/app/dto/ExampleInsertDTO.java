package com.lucasholanda.app.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class ExampleInsertDTO implements Serializable
{

   private static final long serialVersionUID = -4084564163867412641L;

   @ApiModelProperty(value = "Content Field")
   private String content;
   
   public ExampleInsertDTO()
   {
   }
   
   public ExampleInsertDTO(String content)
   {
      super();
      this.content = content;
   }

   public String getContent()
   {
      return content;
   }

   public void setContent(String content)
   {
      this.content = content;
   }
   
}
