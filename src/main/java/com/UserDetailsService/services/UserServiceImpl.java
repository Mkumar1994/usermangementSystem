package com.UserDetailsService.services;

import com.UserDetailsService.model.User;
import com.UserDetailsService.repositary.UserRepositary;
import com.UserDetailsService.userentity.UserEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepositary userRepositary;

    /*@Autowired
    private AddressEntity addressEntity;*/

    @Override
    public User addUser(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity = userRepositary.save(userEntity);
        return modelMapper.map(userEntity, User.class);
    }

    @Override
    public List<User> getUsers() {
        List<UserEntity> usList = userRepositary.findAll();
        Type targetListType = new TypeToken<List<User>>() {
        }.getType();
        List<User> usersList = modelMapper.map(usList, targetListType);
        return usersList;
    }

    @Override
    public User getUsername(String username) {
        Optional<UserEntity> userEntity = userRepositary.findByusername((username));
       User user= null;
        if(userEntity.isPresent()){
            user = modelMapper.map(userEntity.get(), User.class);
        } else
            System.out.println("There is no data for this Id:" + username);

       return user;
    }

    @Override
    public User deleteUserDetails(String username) {
        Optional<UserEntity> userEntity  = userRepositary.findByusername((username));
        userRepositary.delete(userEntity.get());
        System.out.println("user  is deletd");;
        User deleteUser = modelMapper.map(userEntity,User.class);
        return deleteUser;


    }

    @Override
    public User updateUser(User user, String username) {
        UserEntity userEntity = modelMapper.map(user,UserEntity.class);
        userEntity = userRepositary.save(userEntity);
        User userUpadated = modelMapper.map(userEntity,User.class);
        return userUpadated;
    }

}
