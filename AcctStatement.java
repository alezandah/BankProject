public class AcctStatement {

	BankMain forAtm= new BankMain();
	//Method to Check_Balance.
	public void forStatement() {
		System.out.println("\t--Account Information:");
		System.out.println("\t--Total balance: Ghc" + BankMain.totalBalance);
		System.out.println("Available balance: Ghc" + BankMain.availBalance);
		System.out.println("Thank you for banking with us. Do you want to perform another Transaction?");

	} 
}



 