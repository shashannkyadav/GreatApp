package com.example.greatapp.repo;

import com.example.greatapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GreetAppRepo extends JpaRepository<User,Integer> {
    @Query(value ="select c from  user c  where c.firstname= :firstName ",nativeQuery = true )
    List<User> findByFirstName(@Param("firstname")String firstName);

}
