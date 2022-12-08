package com.examFinals.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.examFinals.exam.Entity.UserType;
import com.examFinals.exam.Repo.Repo;

@Controller
public class MainController {
    @Autowired
    Repo repo; 

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String addUsers(@RequestParam String name, @RequestParam String email, @RequestParam String phone, @RequestParam String pass, @RequestParam String cpass) {
        // if (!pass.equals(cpass)) {
        //     return "passErr";
        // }
        UserType newUser = new UserType();

        newUser.setFname(name);
        newUser.setEmail(email);            
        newUser.setNum(Integer.parseInt(phone));
        newUser.setPass(pass);
        newUser.setCpass(cpass);

        repo.save(newUser);

        return "index";
    }
}
