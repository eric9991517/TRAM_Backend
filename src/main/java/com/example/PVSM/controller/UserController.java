package com.example.PVSM.controller;

import com.example.PVSM.model.Users;
import com.example.PVSM.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    /**
     * Query Users Table All Data
     * @return
     */
    @GetMapping("/all")
    public List<Users> getAllUsers(){
       return userRepository.findAll();
    }

    /**
     * Query Single User by user_id
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public Optional<Users> getUserById(@PathVariable Integer userId) {
        return userRepository.findById(userId);
    }

    /**
     * Create a new User
     * @param user
     * @return
     */
    @PostMapping("/add")
    public Users addUser(@RequestBody Users user) {
        return userRepository.save(user);
    }


}
