package com.example.pvsm.controller;

import com.example.pvsm.model.Users;
import com.example.pvsm.repository.UserRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/users")
public class UserController {

private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    /**
     * Query Users Table All Data
     * @return
     */
    @GetMapping(value = "/all")
    @Operation(summary = "取得全部會員資訊")
    public List<Users> getAllUsers(){
       return userRepository.findAll();
    }

    /**
     * Query Single User by user_id
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    @Operation(summary = "透過ID取得會員資訊")
    public Optional<Users> getUserById(@PathVariable Integer userId) {
        return userRepository.findById(userId);
    }

    /**
     * Create a new User
     * @param user
     * @return
     */
    @PostMapping("/add")
    @Operation(summary = "新增會員")
    public Users addUser(@RequestBody Users user) {
        /*隨機產生一組會員ID*/
        String uuid = UUID.randomUUID().toString();
        user.setUuid(uuid.replace("-","").substring(0,8).toUpperCase(Locale.ROOT));
        return userRepository.save(user);
    }


}
