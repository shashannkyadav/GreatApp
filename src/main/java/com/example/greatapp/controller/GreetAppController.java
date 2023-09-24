package com.example.greatapp.controller;

import com.example.greatapp.model.User;
import com.example.greatapp.service.GreetAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GreetAppController {
    @RestController
    public class GreetController {
        @Autowired
        GreetAppService greetAppService;

        @PostMapping("/addUser")
        public User addUser(@RequestBody User user){

            return greetAppService.addUser(user);
        }
        @GetMapping("/greetById/{id}")
        public User greetById(@PathVariable int id) {
            return greetAppService.greetById(id);
        }

        @DeleteMapping("/deleteById/{id}")
        public String deleteById(@PathVariable int id) {
            return greetAppService.deleteById(id);
        }

        @PutMapping("/updateById/{id}")
        public User updateById(@PathVariable int id, @RequestBody User user) {
            return greetAppService.updateById(user, id);
        }
        @GetMapping("/allPeople")
        public List<User> getAll(){
            return greetAppService.getAllUserPeople();
        }

        @PostMapping("/save")
        public User saveUser(@RequestBody User user ){

            return greetAppService.saveData(user);
        }

        @GetMapping("/firstname/{firstname}")
        public List<User> getByFirstName(@PathVariable String firstname){
            return greetAppService.getUserByFirstName(firstname);
        }
}
