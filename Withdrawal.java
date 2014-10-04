import java.util.Scanner;
public class Withdrawal {

	Scanner use = new Scanner(System.in); 
	BankMain forAtm= new BankMain();
	//Method to withdraw money.
	int takenAmt;

	public void forWithdrawal() {
		System.out.println("Please enter the Amount you want to withdraw");
		takenAmt = use.nextInt();
		//Using if else to check for available funds..
		if(BankMain.totalBalance-takenAmt < 0 ) {
			System.out.println("Dude you have Insufficient Amount, do you want to Bankrupt us?");
		}
		else if (takenAmt<0) {
			System.out.println("Dude why would you do that?");
		}
		else
		{
		BankMain.totalBalance=BankMain.totalBalance-takenAmt;
		BankMain.availBalance=BankMain.availBalance-takenAmt;
		System.out.println("Transaction Done! Please take you money");
		System.out.println("Do you want to perform another Transaction?");
		}
	} 
}



