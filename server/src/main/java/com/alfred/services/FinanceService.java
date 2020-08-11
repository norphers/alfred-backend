package com.alfred.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfred.models.BankAccount;
import com.alfred.repositories.BankAccountRepository;

@Service
public class FinanceService {

	@Autowired
	BankAccountRepository financeAccountsRepository;

	// new bank account
	public BankAccount newAccount(BankAccount account) throws Exception {
		
		// check iban format
		// depending iban format, set bank name
		
		boolean existAccount = false;
		List<BankAccount> checkAccounts = financeAccountsRepository.findAll();
		
		for (BankAccount one : checkAccounts) {
			if (account.getIban().equals(one.getIban())) {
				existAccount = true;
			}
		}
		
		if (existAccount) {
			throw new Exception("This account already exists.");
		} else {
			return financeAccountsRepository.save(account);
		}
	}

}
