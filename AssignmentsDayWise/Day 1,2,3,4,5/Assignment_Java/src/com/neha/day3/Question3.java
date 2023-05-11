package com.neha.day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Question3 {

	public static void main(String[] args) {

		HashSet<Account> hsa = new HashSet<>();
		hsa.add(new Account(111, "nam1"));
		hsa.add(new Account(222, "nam2"));
		hsa.add(new Account(111, "nam1"));
		hsa.add(new Account(111, "nam3"));
		Iterator<Account> itr = hsa.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

class Account {
	
	private int account_number;
	private String name;
	
	public Account(int account_number, String name) {
		super();
		this.account_number = account_number;
		this.name = name;
	}
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		final int prime=31;
		int result=1;
		result = prime * result+account_number;
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
		return account_number == other.account_number;
	}
	
	
	
}
