package day_3;

import java.lang.IllegalArgumentException;

public class BankAccount {

    // Declaring the fields
    private String mOwner;
    private int mBalance;
	
    /**
		Constructor
	*/
	
	public BankAccount(String owner, int balance) throws IllegalArgumentException {
		
		// Cannot create account with negative balance, indicate an error
        if (balance < 0) throw new IllegalArgumentException("Not enough money");
        
		// If we're here, balance is OK
		this.mOwner = owner;
        this.mBalance = balance;
    }

    /**
        Adds money to the account
	*/
	
    public void deposit(int amount) {
        if (amount >= 0) mBalance += amount;
        else System.out.println("You cannot deposit negative amount");
    }

    /**
        Deducts money from the account
	*/

    public void withdraw(int amount) {
        if (mBalance >= amount) mBalance -= amount;
        else System.out.println("You cannot withdraw more than you have");
    }
}
