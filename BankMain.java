import java.util.Scanner;
public class BankMain {

	public static double totalBalance = 100.00;
	public static double availBalance=80;

	public static void main(String[] args) {
		//Initializing my variables here
		int num;
		int passcode=1234;
		int pass;
		int selection;
		
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
			System.out.println("Welcome Mr X, you may now proceed to choose a number for your service");
		 	System.out.println("\nATM main menu:");
            System.out.println("1 - Withdraw funds");
            System.out.println("2 - Deposit");
            System.out.println("3 - Account statement");
            System.out.println("4 - Farewell");
            System.out.print("Choice: ");
            selection = use.nextInt();

            switch(selection)
            {
            case 1:
                Withdrawal withdrawal = new Withdrawal();
                withdrawal.forWithdrawal();
                break;
            case 2:
                Deposit forDeposit = new Deposit();
                forDeposit.forDeposit();
                break;
            case 3:
                AcctStatement acctStatement = new AcctStatement();
                acctStatement.forStatement();
                break;
            case 4:
                System.out.println("Thank you for using this ATM!!! goodbye");
        }	
	}
}
}