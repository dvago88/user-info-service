package com.globant.userinfoservice.service;

import com.globant.userinfoservice.model.User;

public interface UserService {

  User findUserByUserId(int userId);

  User save(User user);
}
