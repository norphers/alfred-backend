package com.alfred.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alfred.models.BankAccount;
import com.alfred.repositories.BankAccountRepository;
import com.alfred.services.FinanceService;

@RestController
public class FinanceController {

	@Autowired
	BankAccountRepository financeAccountsRepository;

	@Autowired
	FinanceService financeService;

	@GetMapping("/finance")
	public List<BankAccount> getAllAccounts() {
		List<BankAccount> accounts = financeAccountsRepository.findAll();
		return accounts;
	}

	@PostMapping("/finance")
	public BankAccount newAccount(@RequestBody BankAccount account) throws Exception {
		return financeService.newAccount(account);
	}

}
