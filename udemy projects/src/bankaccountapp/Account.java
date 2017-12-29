package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for saving and checking account
	private String name;
	private String ssn;
	private double balance;
	
	private static int index=1000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String ssn,double initDeposit) {
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;		
		//Set account number
		index++;
		this.accountNumber=setAccountNumber();
		//System.out.println("ACCOUNT NUMBER:"+this.accountNumber);
		setRate();
	}
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN=ssn.substring(ssn.length()-2,ssn.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	public void compound() {
		double accredInterest=balance*(rate/100);
		System.out.println("Accrued Interest:$"+accredInterest);
		printBalance();
	}
	//List common methods 
	public void deposit(double amount) {
		balance=balance+amount;
		printBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		printBalance();
	}
	public void transfer(String  toWhere,double amount) {
		balance=balance-amount;
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now :$"+balance);
	}
	public void showInfo() {
		System.out.println("NAME: "+name);
		System.out.println("ACCOUNT NUMBER:"+accountNumber);
		System.out.println("BALANCE:"+balance);
		System.out.println("RATE:"+rate+"%");
	}

}
