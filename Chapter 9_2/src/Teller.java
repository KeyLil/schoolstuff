
public class Teller extends BankAccount{

	Teller(double balance, double interestRate) {
		super(balance, interestRate);
		
	}

	public static void main(String[] args) {
		
		//Instantiates the BankAccount class through Teller Class
		Teller cAcct = new Teller(100.00, 0.00);
		
		//Instantiates the SavingsAccount class.
		SavingsAccount sAcct = new SavingsAccount(300.00, 1.00);
		
		//Demonstrates the methods of BankAccount class.
		System.out.print("Current checking balance: $");
		System.out.println(cAcct.getBalance());
		cAcct.deposit(200.00);
		cAcct.deposit(120.00);
		cAcct.withdraw(50.00);
		cAcct.withdraw(25.00);
		System.out.print("Current checking balance: $");
		System.out.println(cAcct.getBalance());
		System.out.print("Number of deposits for month: ");
		System.out.println(cAcct.getNumOfDeposits());
		System.out.print("Number of withdrawls for month: ");
		System.out.println(cAcct.getNumOfWithdrawls());
		cAcct.monthlyProcesss();
		System.out.println("-----");
		System.out.print("Current checking balance: $");
		System.out.println(cAcct.getBalance());
		System.out.print("Number of deposits for month: ");
		System.out.println(cAcct.getNumOfDeposits());
		System.out.print("Number of withdrawls for month: ");
		System.out.println(cAcct.getNumOfWithdrawls());
		
		System.out.println("----");
		
		/*Demonstrates the overridden methods in the 
		 * SavingsAccount Class.*/
		
		System.out.print("Current savings balance: $");
		System.out.println(sAcct.getBalance());
		sAcct.withdraw(25.00);
		sAcct.withdraw(55.00);
		sAcct.withdraw(100.00);
		sAcct.withdraw(75.00);
		sAcct.withdraw(10.00);
		System.out.print("Current savings balance: $");
		System.out.println(sAcct.getBalance());
		System.out.print("Number of deposits for month: ");
		System.out.println(sAcct.getNumOfDeposits());
		System.out.print("Number of withdrawls for month: ");
		System.out.println(sAcct.getNumOfWithdrawls());
		sAcct.monthlyProcess();
		System.out.println("-----");
		System.out.print("Current savings balance: $");
		System.out.println(sAcct.getBalance());
		System.out.print("Number of deposits for month: ");
		System.out.println(sAcct.getNumOfDeposits());
		System.out.print("Number of withdrawls for month: ");
		System.out.println(sAcct.getNumOfWithdrawls());
		
		
		sAcct.withdraw(10);
		sAcct.withdraw(10);
		sAcct.withdraw(10);
		sAcct.deposit(5);
		sAcct.deposit(10);
		System.out.print("Current savings balance: $");
		System.out.println(sAcct.getBalance());
		System.out.print("Number of deposits for month: ");
		System.out.println(sAcct.getNumOfDeposits());
		System.out.print("Number of withdrawls for month: ");
		System.out.println(sAcct.getNumOfWithdrawls());
	}

}
