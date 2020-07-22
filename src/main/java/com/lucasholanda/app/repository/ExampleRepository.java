package com.lucasholanda.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lucasholanda.app.dto.ExampleSearchDTO;
import com.lucasholanda.app.entity.ExampleEntity;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleEntity, Long>
{
   
   @Query("SELECT new com.lucasholanda.app.dto.ExampleSearchDTO(e.id, e.content, e.insertDate) "
         + "FROM ExampleEntity e")
   List<ExampleSearchDTO> findAllEntity();
   
}
