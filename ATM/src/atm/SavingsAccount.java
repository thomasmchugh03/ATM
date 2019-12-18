package atm;

import java.util.Random;

/**
 * Class designed to resemble a savings account
 * @author Thomas
 */
public class SavingsAccount 
{
    private String name;
    private int id;
    private int number;
    private double balance = 0;
    private double interest;
    Random r = new Random();
    /**
    * Constructor when balance,id, and name are specified
    * @param amount The initial balance, must be positive 
    * @param num The account id number
    * @param n The account holders name
    */
    public SavingsAccount(double amount, int num, String n)
    {
	balance = amount;
	id = num;
        name = n;
    }
    
    /**
     * Constructor when balance and name are specified but not id
     * @param amount
     * @param n 
     */
    public SavingsAccount(double amount, String n)
    {
        balance = amount;
        id = r.nextInt(1000)+10;
        name = n;
    }
    /**
     * constructor when balance and interest rate are specified
     * @param amount
     * @param interest_rate 
     */
    public SavingsAccount(double amount, double interest_rate)
    {
        balance = amount;
        interest = interest_rate;
    }
    
    /**
     *  Multiply the balance by the designated interest
     */
    public void addInterest()
    {
        balance = balance + balance*(interest * .01);
    }
    
    /**
     * print out the balance
     * @return 
     */
    public double getBalance()
    {
        System.out.print("The balance is: ");
        return balance;
    }
    /**
     * print out id
     * @return 
     */
    public double getID()
    {
        System.out.print("The ID is: ");
        return id;
    }
    /**
     * designate the balance to a set value
     * @param v 
     */
    public void setBalance(double v)
    {
	if (v >= 0)
        {
            balance = v;
	}
    }
    /**
     * Withdraw money from the account, cannot go below 0
     * @param amount The amount to withdraw. Must be greater than balance
     */
    public void withdraw(double amount)
    {
	if(balance - amount >= 0)
	{
            balance = balance - amount;
	}
    }
    /**
     * take all the money out of the account
     */
    public void withdraw()
    {
        balance = 0;
    }
    /**
     * deposit a specific amount of money into the account
     * @param amount 
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
	
}

