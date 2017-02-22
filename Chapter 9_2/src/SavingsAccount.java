
public class SavingsAccount extends BankAccount {
	
	//Constructor 
	public SavingsAccount(double balance, double interestRate){
		super(balance, interestRate);
	}
	
	/*Checks for  the status of an account,
	 * 
	 * If account balance over 25 it's active
	 * If account balance less than 25 it's inactive*/
	public boolean activeStatus(){
		if (getBalance() >= 25 ){
			return true;
			} else {
		return false;
			}
	}
	
	/*Uses activeStatus to verify if account is active and withdrawals funds,
	 * If account is inactive will relay the message and current balance.*/
	public void withdraw(double wtdAmount){
		if(activeStatus() == true){
			super.withdraw(wtdAmount);
		} else {
			System.out.println("Insufficient Funds. Current balance: $" + getBalance());
		}
	}
	
	
	/*Checks whether amount deposited and current balance with equal or 
	 * be greater than 25, if so, funds are deposited.
	 * If not, relays message with current balance.
	 * 
	 * */
	public void deposit(double depAmount){
		if ((getDeposit(depAmount) + getBalance()) >= 25) {
			super.deposit(depAmount);
		} else {
			System.out.println("Account inactive. Balance must be over $25. Current balance: $" + getBalance()); 
		}
	}
	
	
	/*Checks whether number of withdrawls are greater than 4,
	 * if so, service charge will increase by the number of withdrawls
	 * after the 4th withdrawls.
	 * 
	 * Continues the monthly process from Account class.*/
	public void monthlyProcess(){
		if(getNumOfWithdrawls() > 4){
			int numberOfOverdrawls = getNumOfWithdrawls() - 4;
			serviceCharge = serviceCharge + (numberOfOverdrawls);
			super.monthlyProcesss();
		} else {
		super.monthlyProcesss();
		}
		activeStatus();
		
	}
}
