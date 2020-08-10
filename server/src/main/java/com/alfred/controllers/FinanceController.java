package com.alfred.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alfred.models.FinanceAccounts;
import com.alfred.repositories.FinanceAccountsRepository;
import com.alfred.services.FinanceService;

@RestController
public class FinanceController {

	@Autowired
	FinanceAccountsRepository financeAccountsRepository;

	@Autowired
	FinanceService financeService;
	
	@GetMapping("/finance")
	public List<FinanceAccounts> getAllAccounts() {
		List<FinanceAccounts> accounts = financeAccountsRepository.findAll();
		return accounts;
	}

	@PostMapping("/finance")
	public FinanceAccounts newAccount(@RequestBody FinanceAccounts account) throws Exception { // necessito trobar la
																								// manera de validar
		return financeService.newAccount(account);
	}

}
