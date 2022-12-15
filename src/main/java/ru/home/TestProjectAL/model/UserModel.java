package ru.home.TestProjectAL.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserModel {
    @Id
    private String id;
    private String name;
    private String surName;
    private String email;
    private String phoneNumber;
}
