package CoreJava;

import java.util.*;

public class CustomKeyDesing {

	public static void main(String[] args) {
		Map<Account, String> map = new HashMap<>();

		Account a1 = new Account(1);
		a1.setHolderName("abc");
		Account a2 = new Account(2);
		a2.setHolderName("efg");
		map.put(a1, a1.getHolderName());
		map.put(a2, a2.getHolderName());

		System.out.println(map.get(a1)); // abc
		System.out.println(map.get(a2)); // efg

		System.out.println("======================");

		a1.setHolderName("xyz");
		System.out.println(map.get(a1)); // abc

		System.out.println("======================");

		Account a3 = new Account(1);
		a3.setHolderName("4fg");
		System.out.println(map.get(a3)); // abc
		
		map.put(a3, a3.getHolderName());
		System.out.println(map.get(a3));//4fg
		
		
		System.out.println("======================");

		Account a4 = new Account(4);
		a4.setHolderName("dfdf");
		System.out.println(map.get(a4)); // null
		
		map.put(a4, a4.getHolderName());
		System.out.println(map.get(a4));//dfdf

	}

}

class Account {
	private int accountNumber;
	private String holderName;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

}