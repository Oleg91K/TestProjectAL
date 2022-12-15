package ru.home.TestProjectAL.service;

import ru.home.TestProjectAL.model.UserModel;

import java.util.List;

public interface UserService {
    UserModel save (UserModel userModel);
    List<UserModel> findALl();
    UserModel update (UserModel userModel);
    void delete (String id);
}
