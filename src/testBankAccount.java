
public class testBankAccount {

	public static void main(String[] args) throws IllegalArgumentException
	{
		//BankAccount bank=new BankAccount(100.00);
		/*
		 * Error message should display as the account
		 * has a negative parameter.
		 */
		BankAccount bank=new BankAccount(-100.00);
		
		//bank.deposit(150.00);
		//bank.withdraw(50.00);
		
	}
}
