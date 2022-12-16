package com.zaga.SnapValue.Repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.zaga.SnapValue.model.Branch;

public interface BranchRepository extends CrudRepository<Branch, BigInteger> {
    
}
