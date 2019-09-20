package com.globant.userinfoservice.resource;

import com.globant.userinfoservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoResource {

    @GetMapping("/{userId}")
    public User getUserInfo(@PathVariable("userId") int userId) {
        return new User(userId,"Daniel Vargas","123456789","987654321");
    }
}
