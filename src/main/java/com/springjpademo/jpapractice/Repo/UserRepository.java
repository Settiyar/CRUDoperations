package com.springjpademo.jpapractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpademo.jpapractice.User.User;

public interface UserRepository extends JpaRepository<User, Integer>

{

}
