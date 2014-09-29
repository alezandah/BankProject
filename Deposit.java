import java.util.Scanner;
public class Withdrawal {

	Scanner use = new Scanner(System.in); 
	Atm forAtm= new Atm();
	//Method to deposit money.
	public void ForDeposit(int amt) {
		System.out.println("Please enter the Amount you want to withdraw");
		amt = use.nextInt();
		System.out.println("Transaction Done! You can check your deposit now");
		System.out.println("Do you want to perform another Transaction?");

	} 
}