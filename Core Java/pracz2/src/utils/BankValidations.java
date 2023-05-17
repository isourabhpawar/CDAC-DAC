package utils;

import java.time.LocalDate;
import java.util.Map;

import com.banking.AcctType;
import com.banking.BankAccount;

import custom_exceptions.BankingException;

public class BankValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	// validate all inputs
	public static BankAccount validateAllInputs(int acctNo, String customerName, 
			String type, double balance, String createdOn,Map<Integer,BankAccount> accts) throws BankingException
	{
		checkForDup(acctNo,accts);
		validateBalance(balance);
		AcctType acctType = parseAndValidateType(type);
		LocalDate creationDate = parseCreationDate(createdOn);
		return new BankAccount(acctNo, customerName, acctType, balance, creationDate);
		
	}

	// no dups check : HOW : containsKey
	public static void checkForDup(int acctNo, Map<Integer, BankAccount> accts) throws BankingException {
		if (accts.containsKey(acctNo))// auto boxing --> up castng : O(1)
			throw new BankingException("Dup A/C no !!!!!!!!!!!!!");
	}

//add a static method to validate balance
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Min balance reached !!!!");

	}

	// add a static method for parsing n validating ac ype
	public static AcctType parseAndValidateType(String acctType) {
		return AcctType.valueOf(acctType.toUpperCase());
	}

	// add a static method for parsing date
	public static LocalDate parseCreationDate(String date) {
		return LocalDate.parse(date);// yyyy-MM-dd
	}
}
