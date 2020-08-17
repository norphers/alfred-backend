package com.alfred.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "banks")
public class BankAccount implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public enum Currency {
		EURO, DOLLAR, POUND
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String bank;

	private String iban;

	private Currency currency;

	private int initialBalance;

	private int currentBalance;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private User username;
	
	//

	public BankAccount() {

	}

	public BankAccount(Long id, String name, String bank, String iban, Currency currency, int initialBalance,
			int currentBalance, User username) {
		super();
		this.id = id;
		this.name = name;
		this.bank = bank;
		this.iban = iban;
		this.currency = currency;
		this.initialBalance = initialBalance;
		this.currentBalance = currentBalance;
		this.username = username;
	}

	//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	public User getUsername() {
		return username;
	}

	public void setUser(User username) {
		this.username = username;
	}
	

}
