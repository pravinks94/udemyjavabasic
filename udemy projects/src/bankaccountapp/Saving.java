package bankaccountapp;

public class Saving extends Account{
	//List properties specific to the Saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//Constructor to initialize setting for the Saving properties
	public Saving(String name,String ssn,double InitDeposit) {
		super(name,ssn,InitDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}
	
	//List any methods specific to saving account 
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: SAVING");
		System.out.println("Your Saving Account Features");
		System.out.println("Safety Deposit Box ID:"+safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key:"+safetyDepositBoxKey);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate=getBaseRate()-.25;
		
	}

}
