
public class BankAccount {

	private double balance;

	
	public BankAccount(double initialBalance)
	{
		if(initialBalance<0)
		{
			IllegalArgumentException exception= new IllegalArgumentException("Inital Balance cant be less than 0");
			throw exception;
		}
		balance=initialBalance;
	}
	
	public void deposit(double amount)
	{
		if(amount<0)
		{
			IllegalArgumentException exception= new IllegalArgumentException("You cant deposit a negative amount");
			throw exception;
		}
		balance=balance+amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			IllegalArgumentException exception= new IllegalArgumentException("You cant withdraw more than you have");
			throw exception;
		}
		balance=balance-amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	
	
	/*
	catch(IllegalArgumentException ie)
	{
		System.out.println("");
	}
	catch(IllegalArgumentException ie)
	{
		System.out.println("");
	}
	catch(IllegalArgumentException ie)
	{
		System.out.println("");
	}
	*/
	


}
