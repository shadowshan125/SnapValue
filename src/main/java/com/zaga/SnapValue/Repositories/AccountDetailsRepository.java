package com.zaga.SnapValue.Repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.zaga.SnapValue.model.AccountDetails;

public interface AccountDetailsRepository extends CrudRepository<AccountDetails, BigInteger> {
    
}
