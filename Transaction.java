
public class Transaction {
	private String transactionDate, transactionTime, kind;
	private double amount, balance;
	
	public Transaction() {}
	
	
	// Default function where we pass the needed parameters and assign their values to the function's attributes
	public Transaction(String transactionDate, String transactionTime, String kind, double amount, double balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	
	// Bunch of getters and setters so we can pass details between classes
	public String getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getTransactionTime() {
		return transactionTime;
	}
	
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
		
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(transactionDate);
		sb.append("|");
		sb.append(transactionTime);
		sb.append("|");
		sb.append("kind");
		sb.append("|");
		sb.append(amount);
		sb.append("|");
		sb.append(balance);
		
		return sb.toString();
	}
	
	
}
