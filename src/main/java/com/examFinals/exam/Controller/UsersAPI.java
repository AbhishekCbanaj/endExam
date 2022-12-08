package com.examFinals.exam.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examFinals.exam.Entity.UserType;
import com.examFinals.exam.Repo.Repo;

@RestController
public class UsersAPI {
    @Autowired
    Repo repo;
    
    @GetMapping("/getUsers")
    public List<UserType> getUsers() {
        return repo.findAll();
    }
}
