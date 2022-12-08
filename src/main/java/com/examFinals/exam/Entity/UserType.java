package com.examFinals.exam.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String fname;
    String email;
    int num;
    String pass;
    String cpass;
}