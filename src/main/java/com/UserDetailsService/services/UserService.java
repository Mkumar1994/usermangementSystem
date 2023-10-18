package com.UserDetailsService.services;

import com.UserDetailsService.model.User;
import java.util.List;

public interface UserService {
  public   User addUser(User user);

    public List<User> getUsers();

    public  User getUsername(String username);

   public  User deleteUserDetails(String username);

   public  User updateUser(User user, String username);
}
