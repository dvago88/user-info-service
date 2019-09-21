package com.globant.userinfoservice.repository;

import com.globant.userinfoservice.model.User;

public interface UserRepository {

    User findUserById(int userId);
}
