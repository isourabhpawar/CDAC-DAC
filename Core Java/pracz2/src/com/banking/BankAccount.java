package com.banking;

import java.time.LocalDate;

import custom_exceptions.BankingException;

import static utils.BankValidations.validateBalance;

/*
 * BankAccount : acctNo, customer name , type , balance , creation date , 
 * last tx date , isActive
 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private AcctType type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;

	// ctor
	public BankAccount(int acctNo, String customerName, AcctType type, double balance, LocalDate createdOn) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = this.createdOn;
		this.isActive = true;
	}
	// fetch a/c summary : toString

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive
				+ "]";
	}

	// For correct working of hashing algo + O(1) :
	// which methods(equals , hashCode) should be overridden? NONE , since HM will
	// call these methods on Key type
	// BankAccount : Value type
	public void deposit(double amount) throws BankingException {
		if (isActive) {
			balance += amount;
			this.lastUpdated = LocalDate.now();
		} else
			throw new BankingException("Inactive A/C !!!!!! , Can not deposit !!!!");
	}

	public void withdraw(double amount) throws BankingException {
		if (isActive) {
			validateBalance(balance - amount);
			balance -= amount;
			this.lastUpdated = LocalDate.now();
		} else
			throw new BankingException("Inactive A/C !!!!!!");
	}

	public void transferFunds(BankAccount dest, double amount) throws BankingException {
		// check if accts are active!
		if (this.isActive && dest.isActive) {
			this.withdraw(amount);
			dest.deposit(amount);
		}
		else
			throw new BankingException("Inactive A/C/s !!!!!!");
		
	}
	// getters

	public int getAcctNo() {
		return acctNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public AcctType getType() {
		return type;
	}

	public String getCustomerName() {
		return customerName;
	}

}
