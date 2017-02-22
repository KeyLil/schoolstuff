
public abstract class BankAccount {
	
	//Variables
	private double balance = 0.00;
	private int numOfDeposits = 0;
	private int numOfWithdrawls = 0;
	private double interestRate = 0.00;
	protected double serviceCharge = 1.00;
	
	//Constructor
	 BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	 //Adds Deposit Amount to Balance and count the number of Deposits
	public void deposit(double depAmount){
		balance = balance + depAmount;
		numOfDeposits++;
	}
	
	 //Subtracts Withdraw Amount from Balance and count the number of Withdrawals.	
	public void withdraw(double wtdAmount){
		balance = balance - wtdAmount;
		numOfWithdrawls++;
	}
	
	//Calculates interest for the balance within an account for that month.
	public void calcInterest(){
		double monthlyInterestRate;
		double monthlyInterest;
		
		monthlyInterestRate = interestRate/12;
		monthlyInterest = balance * monthlyInterestRate;
		balance = balance + monthlyInterest;
	}
	
	//Subtracts the monthly service charge from the balance, calculates and adds interest to account, resets counters.
	public void monthlyProcesss(){
		balance = balance - serviceCharge;
		calcInterest();
		numOfWithdrawls = 0;
		numOfDeposits = 0;
		serviceCharge = 1.00;
	}
	
	//getter for Balance.
	public double getBalance(){
		return balance;
	}

	//getter for numOfDeposits.	
	public int getNumOfDeposits(){
		return numOfDeposits;
	}
	
	//getter for numOfWithdrawals.
	public int getNumOfWithdrawls(){
		return numOfWithdrawls;
	}
	
	//getter for Deposit Amount.
	public double getDeposit(double depAmount){
		return depAmount;
	}
	
}
