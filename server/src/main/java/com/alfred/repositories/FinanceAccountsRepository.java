package com.alfred.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfred.models.FinanceAccounts;

public interface FinanceAccountsRepository extends JpaRepository<FinanceAccounts, Long> {

}
