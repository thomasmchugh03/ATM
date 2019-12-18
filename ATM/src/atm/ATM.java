package atm;

/**
 *
 * @author Thomas
 */

public class ATM 
{
	public static void main(String args[])
	{
		BankAccount account1, account2;
		
		account1 = new BankAccount(0, "Harry");
                System.out.println("The expected result is 100");
                System.out.println(account1.getBalance());
                account1.deposit(1000);
                account1.withdraw(500);
                account1.withdraw(400);
                System.out.println(account1.getBalance() + "\n");
                
                account2 = new BankAccount(1000, "Gary");
                System.out.println("The expected result is 1100");
                System.out.println(account2.getBalance());
                account2.addInterest(10);
                System.out.println(account2.getBalance() + "\n");
                
                SavingsAccount account3;
                
                account3 = new SavingsAccount(1000, 10);
                System.out.println("The expected result is 1100");

                System.out.println(account3.getBalance());
                account3.addInterest();
                System.out.println(account3.getBalance() + "\n");
                
                BankAccount account4, account5;
                
                account4 = new BankAccount(1000, "Larry");
                account5 = new BankAccount(1000, "Other Larry");
                System.out.println("Account 4 balance " + account4.getBalance());
                System.out.println("Account 5 balance " + account5.getBalance());
                
                account4.transfer(1000, account5);
                
                System.out.println("Account 4 new balance " + account4.getBalance());
                System.out.println("Account 5 new balance " + account5.getBalance());
                
	}
}
