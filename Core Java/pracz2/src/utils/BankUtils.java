package utils;

import static utils.BankValidations.validateAllInputs;

import java.util.HashMap;
import java.util.Map;

import com.banking.BankAccount;

import custom_exceptions.BankingException;

public class BankUtils {
//add a static method to populate map of bank accounts -with sample data
	// int acctNo, String customerName, String type, double balance, String
	// createdOn
	// 101,"Rama Kher","saving",12000,"2023-01-01"
	// 10,"Kiran Shekh","current",8000,"2023-02-11"
	// 50,"Shubham Agarwal","saving",14000,"2023-05-21"
	// 35,"Kunal Singh","fd",120000,"2022-11-01"
	// 48,"Rekha Patil","saving",111000,"2022-12-11"
	// 65,"Mihir Rao","saving",18000,"2023-05-01"
	// 110,"Shilpa Kadam","loan",100000,"2023-04-15"
	// 10,"Shirish Inamdar","FD",80000,"2023-12-11"
	public static Map<Integer, BankAccount> populateMap() throws BankingException {
		// create empty map
		Map<Integer, BankAccount> map = new HashMap<>();// size=0;init capa=16,L.F=0.75
		// put vs putIfAbsent
		System.out.println(
				"put " + map.put(101, validateAllInputs(101, "Rama Kher", "saving", 12000, "2023-01-01", map)));
		System.out.println(
				"put " + map.put(10, validateAllInputs(10, "Kiran Shekh", "current", 8000, "2023-02-11", map)));
		System.out.println(
				"put " + map.put(50, validateAllInputs(50, "Shubham Agarwal", "saving", 14000, "2023-05-21", map)));
		System.out.println("put " + map.put(35, validateAllInputs(35, "Kunal Singh", "fd", 120000, "2022-11-01", map)));
		System.out.println(
				"put " + map.put(48, validateAllInputs(48, "Rekha Patil", "saving", 111000, "2022-12-11", map)));
		System.out
				.println("put " + map.put(65, validateAllInputs(65, "Mihir Rao", "saving", 18000, "2023-05-01", map)));
		System.out.println(
				"put " + map.put(90, validateAllInputs(90, "Shirish Inamdar", "FD", 80000, "2023-12-11", map)));
		return map;
	}

	// add a method to fetch a/c summary
	public static BankAccount fetchAccountSummary(int acctNo, Map<Integer, BankAccount> map) throws BankingException {
		BankAccount account = map.get(acctNo);
		if (account != null) {
			if (account.isActive())
				return account;
			throw new BankingException(account.getAcctNo() + " is Locked!!!!");
		}
		throw new BankingException("Account no : " + " is invalid!!!!!");

	}
}
