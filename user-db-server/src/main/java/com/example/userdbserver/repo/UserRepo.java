package com.example.userdbserver.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.userdbserver.models.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
