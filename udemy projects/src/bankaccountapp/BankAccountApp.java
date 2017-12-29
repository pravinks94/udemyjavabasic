package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>();
		
		String file="C:\\Users\\Pravin Kumar\\eclipse-workspace\\udemy projects\\src\\bankaccountapp\\NewBankAccounts.csv";
		
/*		Checking chkacc1=new Checking("Tom Elims","42341241",1500);
		Saving savacc1=new Saving("Wayne Wilson","43423423",2500);
		savacc1.showInfo();
		chkacc1.showInfo();
		savacc1.deposit(5000);
		savacc1.withdraw(3000);
		savacc1.transfer("brokage", 1000);
*/		
		//Read a CSV File then create new accounts based on that data
		List<String[]> newAccountHolder=utilities.CSV.read(file);
		for(String[] accountHolder:newAccountHolder) {
			System.out.println("NEW ACCCOUNT");
			String name=accountHolder[0];
			String ssn=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			System.out.println(name+" "+ssn+" "+accountType+"$"+initDeposit);
			if(accountType.equals("Saving")) {
				System.out.println("Open a SAVING Account");
				accounts.add(new Saving(name,ssn,initDeposit));
			}
			else if(accountType.equals("Checking")){
				System.out.println("Open a CHECKING ACCOUNT");
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		accounts.get(5).showInfo();
		for(Account acc:accounts) {
			acc.showInfo();
		}

	}

}
