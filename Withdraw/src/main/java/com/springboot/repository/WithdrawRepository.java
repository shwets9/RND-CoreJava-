package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.model.BankAccount;

public interface WithdrawRepository extends MongoRepository<BankAccount,String>{
	
	public BankAccount findByAccountNumber(int accountNumber);
	

}
