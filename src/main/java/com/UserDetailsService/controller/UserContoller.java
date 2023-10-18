package com.UserDetailsService.controller;


import com.UserDetailsService.model.User;
import com.UserDetailsService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserContoller {
   @Autowired
  private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
       return userService.addUser(user);
    }

    @GetMapping("/getusers")
    public List<User> getUsers(){
        return userService.getUsers();
    }


    @GetMapping("/getuser/{username}")
    public User getUsername(@PathVariable("username") String username){
        return userService.getUsername(username);
    }

    @PutMapping("/getuser/{username}")
    public User updateUser(@RequestBody User user,@PathVariable("username") String username){
        return userService.updateUser(user,username);
    }


    @DeleteMapping("/getuser/{username}")
    public User deleteUserDetails(@PathVariable("username") String username){
       return userService.deleteUserDetails(username);
    }


}
