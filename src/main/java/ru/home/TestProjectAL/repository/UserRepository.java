package ru.home.TestProjectAL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.home.TestProjectAL.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository <UserModel,String> {
}
