package com.globant.userinfoservice.resource;

import com.globant.userinfoservice.model.User;
import com.globant.userinfoservice.service.UserService;
import com.globant.userinfoservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoResource {

  private UserService userService;

  @Autowired
  public UserInfoResource(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping("/{userId}")
  public User getUserInfo(@PathVariable("userId") int userId) {
    return userService.findUserByUserId(userId);
  }

  @PostMapping(value = "/",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public User createUser(@RequestBody User user) {
    return userService.save(user);
  }
}
