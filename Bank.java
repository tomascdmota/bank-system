import java.util.Scanner;

public class Bank {
	  private Account[] accounts = new Account[10];
	  private int totalAccount;

	  public void addAccount(String accountNo, String name, double balance) {
	    accounts[totalAccount++] = new Account(accountNo, name, balance);
	  }
	  
	  
	  public Account getAccount(String accountNo) {
		  for (int i=0; i<totalAccount; i++) {
			  if(accountNo.equals(accounts[i].getAccountNo())) {
				  return accounts[i];
			  }
		  }
		  return null;
	  }
	  
	  
	  public Account[] findAccountByName(String name) {
		  // here we are retrieving every account there is
		  Account[] temp = new Account[totalAccount];
		  int total = 0;
		  for (int i = 0; i < totalAccount; i++) {
			  if(name.equals(accounts[i].getName())) {
			  temp[total++] = accounts[i];
			  }
		  }
		  
		  Account[] matched = new Account[total];
		  for (int i = 0; i < total; i++) {
			  matched[i] = temp[i];
		  }
		  return matched;
	  }
	  
	  public Account[] getAccounts() {
		  return accounts;
	  }
	  
	  public int getTotalAccount() {
		  return totalAccount;
	  }
	  
	  
	  
	  void menu() {
		  char option;
		  Account acc = new Account();
		  Scanner sc = new Scanner(System.in);
		  String customerName = acc.getName();
		  String customerNo = acc.getAccountNo();
		  double amount = 0;
		  System.out.println("Welcome " + customerName);
		  System.out.println("Your ID:" + customerNo);
		  
		  
		  do {
		  System.out.println("Please, choose an option: \n");
		  option = sc.next().charAt(0);
		  System.out.println("\n");
		  
		  switch(option) {
		  
		  case 'a':
			  System.out.println("Your account balance is: \n " + acc.getBalance());
			  break;
			  
		  case 'b':
			  System.out.println("Enter the amount to be deposited: " + amount);
			  amount = sc.nextDouble();
			  acc.deposit(amount);
			  System.out.println("Your account balance is: \n " + acc.getBalance());
			  break;
		  
		  case 'c':
			  System.out.println("Enter the amount to be withdrawan" + amount);
			  amount = sc.nextDouble();
			  acc.withdraw(amount);
			  break;
			  
			  
			  default:
				  System.out.println("Please choose a correct option.");
					break;
		  }
		  
		  
	  } while (option!='e');
		  System.out.println("thank you for your preference");
		  
	  
	  
	  }
}


