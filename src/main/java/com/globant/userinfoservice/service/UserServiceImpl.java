package com.globant.userinfoservice.service;

import com.globant.userinfoservice.model.User;
import com.globant.userinfoservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User findUserByUserId(int userId) {
    return userRepository.findUserByUserId(userId);
  }
}
