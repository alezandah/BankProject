import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		//Initializing my variables here
		int num;
		int passcode=1234;
		int pass;
		Scanner use = new Scanner(System.in); 
		//Starting the program and verifying user password
		System.out.println("Please enter you passsword:");
		pass=use.nextInt();
		if(pass != passcode) {
			System.out.println("Wrong password, are you a thief?..Byeeee!!!");
		}
		//choosing ATM functions
		while(pass==passcode)
		{
		System.out.println("Welcome Mr X, you may now proceed.");
		System.out.println("What service are you here for?, Press '1', for Withdrawal, '2' to Check_Balance and '3' to Deposit");
		num=use.nextInt();
		if (num==1) {

		}
		else if (num==2) {
			
		}
		else
		{

		}
		}
		
	}
}