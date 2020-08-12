package com.alfred.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfred.models.BankAccount;

public interface BankAccountRepository extends JpaRepository <BankAccount, Long> {

}
