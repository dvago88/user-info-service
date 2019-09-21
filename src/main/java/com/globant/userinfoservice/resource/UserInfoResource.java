package com.globant.userinfoservice.resource;

import com.globant.userinfoservice.model.User;
import com.globant.userinfoservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoResource {

    private UserRepository userRepository;

    @Autowired
    public UserInfoResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{userId}")
    public User getUserInfo(@PathVariable("userId") int userId) {
        return userRepository.findUserById(userId);
    }
}
