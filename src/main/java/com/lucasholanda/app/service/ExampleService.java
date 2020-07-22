package com.lucasholanda.app.service;

import java.util.List;

import com.lucasholanda.app.dto.ExampleInsertDTO;
import com.lucasholanda.app.dto.ExampleSearchDTO;
import com.lucasholanda.app.dto.ExampleUpdateDTO;

public interface ExampleService
{

   public List<ExampleSearchDTO> findAllEntity();
   
   public void insert(ExampleInsertDTO dto);
   
   public void update(ExampleUpdateDTO dto);
   
   public void delete(Long id);
   
}
