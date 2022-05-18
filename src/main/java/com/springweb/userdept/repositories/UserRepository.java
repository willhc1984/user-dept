package com.springweb.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
