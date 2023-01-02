package com.zaga.SnapValue.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.zaga.SnapValue.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long> {

    
    
}
