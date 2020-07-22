package com.lucasholanda.app.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class ExampleUpdateDTO implements Serializable
{

   private static final long serialVersionUID = -2751053575183007111L;
   
   @ApiModelProperty(value = "Id Field")
   private Long id;
   
   @ApiModelProperty(value = "Content Field")
   private String content;
   
   public ExampleUpdateDTO()
   {
   }
   
   public ExampleUpdateDTO(Long id, String content)
   {
      super();
      this.id = id;
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

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }
   
}
