package com.example.greatapp.service;

import com.example.greatapp.model.User;
import com.example.greatapp.repo.GreetAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GreetAppService {
    @Autowired
    GreetAppRepo greetAppRepo;

    public User addUser(User user){

        return greetAppRepo.save(user);
    }
    public User greetById(int id) {
        return greetAppRepo.findById(id).orElse(null);

    }

    public String deleteById(int id) {
        greetAppRepo.deleteById(id);
        return "Delete Successfully";
    }

    public User updateById(User user, int id) {
        user.setId(id);
        return greetAppRepo.save(user);


    }
    public User saveData(User user) {
        return user;
    }

    public List<User> getUserByFirstName(String firstname) {
        return greetAppRepo.findByFirstName(firstname);
    }

    public List<User> getAllUserPeople() {
        return greetAppRepo.findAll();
    }

}
