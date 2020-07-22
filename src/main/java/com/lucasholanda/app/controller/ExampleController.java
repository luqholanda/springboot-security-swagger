package com.lucasholanda.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucasholanda.app.dto.ExampleInsertDTO;
import com.lucasholanda.app.dto.ExampleSearchDTO;
import com.lucasholanda.app.dto.ExampleUpdateDTO;
import com.lucasholanda.app.service.ExampleService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/example")
public class ExampleController
{
   
   @Autowired
   ExampleService service; 
   
   @ApiOperation(value = "Search")
   @ApiResponses(value = { 
      @ApiResponse(code = 200, message = "Successful operation", response = ExampleSearchDTO.class, reference = "List"),
      @ApiResponse(code = 204, message = "No records found"), 
      @ApiResponse(code = 401, message = "Access denied"),
      @ApiResponse(code = 403, message = "You doesn't have permission"), 
      @ApiResponse(code = 404, message = "Not found"),
      @ApiResponse(code = 500, message = "Internal server error") 
   })
   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
   public List<ExampleSearchDTO> get(@RequestHeader(name = "Authorization", required = false) String token)
   {
      return service.findAllEntity();
   }
   
   @ApiOperation(value = "Insert")
   @ApiResponses(value = { 
      @ApiResponse(code = 200, message = "Successful operation"),
      @ApiResponse(code = 204, message = "No records found"), 
      @ApiResponse(code = 401, message = "Access denied"),
      @ApiResponse(code = 403, message = "You doesn't have permission"), 
      @ApiResponse(code = 404, message = "Not found"),
      @ApiResponse(code = 500, message = "Internal server error") 
   })
   @PostMapping
   public void insert(@RequestHeader(name = "Authorization", required = false) String token,
         @ApiParam(name = "Example DTO", value = "Object to insert", required = true) @RequestBody ExampleInsertDTO dto)
   {
      service.insert(dto);
   }
   
   @ApiOperation(value = "Update")
   @ApiResponses(value = { 
      @ApiResponse(code = 200, message = "Successful operation"),
      @ApiResponse(code = 204, message = "No records found"), 
      @ApiResponse(code = 401, message = "Access denied"),
      @ApiResponse(code = 403, message = "You doesn't have permission"), 
      @ApiResponse(code = 404, message = "Not found"),
      @ApiResponse(code = 500, message = "Internal server error") 
   })
   @PutMapping
   public void update(@RequestHeader(name = "Authorization", required = false) String token, @ApiParam(name = "Example DTO", value = "Object to update", required = true) @RequestBody ExampleUpdateDTO dto)
   {
      service.update(dto);
   }
   
   @ApiOperation(value = "Delete")
   @ApiResponses(value = { 
      @ApiResponse(code = 200, message = "Successful operation"),
      @ApiResponse(code = 204, message = "No records found"), 
      @ApiResponse(code = 401, message = "Access denied"),
      @ApiResponse(code = 403, message = "You doesn't have permission"), 
      @ApiResponse(code = 404, message = "Not found"),
      @ApiResponse(code = 500, message = "Internal server error") 
   })
   @DeleteMapping
   public void delete(@RequestHeader(name = "Authorization", required = false) String token, @ApiParam(name = "id", value = "Example ID", required = true) @RequestParam Long id)
   {
      service.delete(id);
   }
   
}
