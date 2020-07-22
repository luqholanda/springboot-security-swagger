package com.lucasholanda.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

public class ExampleSearchDTO implements Serializable
{

   private static final long serialVersionUID = -2491821272900553882L;

   @ApiModelProperty(value = "Id Field")
   private Long id;
   
   @ApiModelProperty(value = "Content Field")
   private String content;
   
   @ApiModelProperty(value = "Insert Date Field")
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
   private Date insertDate;
   
   public ExampleSearchDTO()
   {
   }
   
   public ExampleSearchDTO(Long id, String content, Date insertDate)
   {
      super();
      this.id = id;
      this.content = content;
      this.insertDate = insertDate;
   }

   public String getContent()
   {
      return content;
   }

   public void setContent(String content)
   {
      this.content = content;
   }

   public Date getInsertDate()
   {
      return insertDate;
   }

   public void setInsertDate(Date insertDate)
   {
      this.insertDate = insertDate;
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
