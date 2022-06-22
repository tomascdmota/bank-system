import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Account {
	private String accountNo,name;
	private double balance;
	// Creates an array of size 100 with the transactions made by said account
	private Transaction[] transactions = new Transaction[100];
	private int totalTransaction;
	
	static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	static final String DEPOSIT = "Deposit";
	static final String WITHDRAW = "Withdraw";
	
	public Account() {}

	
	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	/*
	 * Below we are creating the operations that the account will be able to perform 
	 * in this case it's only either a deposit or withdraw.
	 *  Below that, we are defining getters and setters to be able to set the account info
	 *  and get those details on another class (probably the main.java where we will put
	 *  everything together) */
	
	public void deposit(double amount) {
		balance = balance + amount;
		Transaction transaction = new Transaction();
		Calendar calendar =  Calendar.getInstance();
		Date date = calendar.getTime();
		// Here we call our setters from the Transaction.java class which
		// will allow us to set the details of said transaction.
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(DEPOSIT);
		transactions[totalTransaction++] = transaction;
	}
	
	
	public void withdraw(double amount) {
		balance = balance - amount;
		// Calling and instanciating the Transaction class so we can access it's functions (in this case the setters);
		Transaction transaction = new Transaction();
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(WITHDRAW);
		transactions[totalTransaction++] = transaction;
	}
	
	// Setters and Getters start here
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}
	
	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}
	
	public int getTotalTransactions() {
		return totalTransaction;
	}
	
	public void setTotalTransaction(int totalTransaction) {
		this.totalTransaction = totalTransaction;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(accountNo);
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(balance);
		return sb.toString();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	