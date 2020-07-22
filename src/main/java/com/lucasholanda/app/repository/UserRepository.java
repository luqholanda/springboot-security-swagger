package com.lucasholanda.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lucasholanda.app.dto.UserLoginDTO;
import com.lucasholanda.app.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>
{
   
   @Query("SELECT new com.lucasholanda.app.dto.UserLoginDTO(u.id, u.name, u.login, u.password) "
         + "FROM UserEntity u "
         + "WHERE u.login = :login")
   UserLoginDTO findByLogin(@Param("login") String login);
   
}
