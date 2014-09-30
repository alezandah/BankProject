import java.util.Scanner;
public class Deposit {

	Scanner use = new Scanner(System.in); 
	BankMain forAtm = new BankMain();
	//Method to deposit money.
	int depAmt;

	public void forDeposit() {
		System.out.println("Please enter the Amount you want to Deopsit");
		depAmt = use.nextInt();
		BankMain.totalBalance=BankMain.totalBalance+depAmt;
		BankMain.availBalance=BankMain.availBalance+depAmt;
		System.out.println("Transaction Done! You can check your deposit now");
		System.out.println("Do you want to perform another Transaction?");

	} 
}