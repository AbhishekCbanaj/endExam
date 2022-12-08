package com.examFinals.exam.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examFinals.exam.Entity.UserType;

public interface Repo extends JpaRepository<UserType, Integer> {
    List<UserType> findAll();
}