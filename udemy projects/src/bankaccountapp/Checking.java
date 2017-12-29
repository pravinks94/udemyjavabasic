package bankaccountapp;

public class Checking extends Account{
	//List properties specific to a Checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checking(String name,String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
	}
	public void setRate() {
		rate=getBaseRate()*.15;
	}
	//List any methods specific to a checking account
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: CHECKING");
		System.out.println("Your Checking Account Features");
		System.out.println("Debit Card Number:"+debitCardNumber);
		System.out.println("Debit Card PIN:"+debitCardPIN);
	}

}
