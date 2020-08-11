package com.alfred.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfred.models.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
