package com.example.demo_ajs.repository;

import com.example.demo_ajs.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity, Long> {

}
