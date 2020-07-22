package com.lucasholanda.app.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasholanda.app.dto.ExampleInsertDTO;
import com.lucasholanda.app.dto.ExampleSearchDTO;
import com.lucasholanda.app.dto.ExampleUpdateDTO;
import com.lucasholanda.app.entity.ExampleEntity;
import com.lucasholanda.app.repository.ExampleRepository;
import com.lucasholanda.app.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService
{

   @Autowired
   ExampleRepository repository;
   
   @Override
   public List<ExampleSearchDTO> findAllEntity()
   {
      return repository.findAllEntity();
   }

   @Override
   public void insert(ExampleInsertDTO dto)
   {
      ExampleEntity entity = new ExampleEntity();
      entity.setContent(dto.getContent());
      entity.setInsertDate(new Date());
      
      this.repository.save(entity);
   }

   @Override
   public void update(ExampleUpdateDTO dto)
   {
      Optional<ExampleEntity> optionalEntity = this.repository.findById(dto.getId());
      
      if (optionalEntity.isPresent())
      {
         ExampleEntity entity = optionalEntity.get();
         entity.setContent(dto.getContent());
         this.repository.save(entity);
      }
   }

   @Override
   public void delete(Long id)
   {
      this.repository.deleteById(id);
   }

}
