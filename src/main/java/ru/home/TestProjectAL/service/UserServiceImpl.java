package ru.home.TestProjectAL.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.home.TestProjectAL.model.UserModel;
import ru.home.TestProjectAL.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public UserModel save(UserModel userModel) {
        validate(userModel);
        return userRepository.save(userModel);
    }
    private void validate(UserModel userModel) {
        if (userModel.getName() == null || userModel.getName().isEmpty()) {
            throw new IllegalArgumentException("Name is null or Empty");
        }
        if (userModel.getSurName() == null || userModel.getSurName().isEmpty()) {
            throw new IllegalArgumentException("SurName is null or Empty");
        }
        if (userModel.getEmail() == null || userModel.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email is null or Empty");
        }
        if (userModel.getPhoneNumber() == null || userModel.getPhoneNumber().isEmpty()) {
            throw new IllegalArgumentException("PhoneNumber is null or Empty");
        }
    }

    @Override
    public List<UserModel> findALl() {
        return userRepository.findAll();
    }

    @Override
    public UserModel update(UserModel userModel) {
        userRepository.findById(userModel.getId()).orElseThrow(()-> new IllegalArgumentException("model doesn't exist"));
        validate(userModel);
        return userRepository.save(userModel);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
