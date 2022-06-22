import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		// Gets user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account: ");
		Account acc = new Account();
		// the nextLine function is part of the sc package and acts as a form of storing the user input
		System.out.println("Name: ");
		String customerName = sc.nextLine().toUpperCase();
		acc.setName(customerName);
		System.out.println("Customer ID: ");
		String customerId = sc.nextLine().toUpperCase();
		acc.setAccountNo(customerId);
		System.out.println(acc.getAccountNo() + acc.getName() );
		// BankAccount here is the class we created down bellow that is responsible for storing the user info and takes 2 arguments
		Bank bank = new Bank();
		bank.menu();
		
		// Here we are calling the menu function declared at last on the "bank" which is the bank account with the details we have just input.
		
	}
	

	void menu() {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		String customerName = acc.getName();
		String customerId = acc.getAccountNo();
		char option;
		System.out.println("welcome " + customerName);
		System.out.println("Your id: " + customerId);
		System.out.println("\n (a) Check Balance\n (b) Deposit Amount\n (c) Withdraw Amount\n (d) Previous Transaction\n (e) Exit\n");
		
		do {
			System.out.println("Choose an option: \n");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'a':
				System.out.println("Your balance is: " + acc.getBalance());
				break;
				
			default:
				System.out.println("Please choose a correct option.");
				break;
			}
		} while(option!='e');
		System.out.println("Thank you for your preference.");
		}

	}




