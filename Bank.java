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
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please, choose an option: \n")
	  }
}
