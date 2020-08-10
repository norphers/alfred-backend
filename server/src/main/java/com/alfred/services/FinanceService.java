package com.alfred.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfred.models.FinanceAccounts;
import com.alfred.repositories.FinanceAccountsRepository;

@Service
public class FinanceService {

	@Autowired
	FinanceAccountsRepository financeAccountsRepository;

	// CREATE { new finance account }
	public FinanceAccounts newAccount(FinanceAccounts account) throws Exception {
		
		// check iban format
		// depending iban format, set bank name
		
		boolean isFound = false;
		List<FinanceAccounts> checkAccounts = financeAccountsRepository.findAll();
		
		for (FinanceAccounts one : checkAccounts) {
			if (account.getIban().equals(one.getIban())) {
				isFound = true;
			}
		}

		if (isFound) {
			throw new Exception("The account already exists.");
		} else {
			return financeAccountsRepository.save(account);
		}
	}

}
