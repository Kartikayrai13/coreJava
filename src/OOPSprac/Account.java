package OOPSprac;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double balance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//public void deposit(double amount) {
		//double bal= getBalance();
		//setBalance(bal + amount);
		//System.out.println("Balance="+ getBalance);
	//}

	//public  withdrawal() {
		//return withdrawal;
	//}

	public String fundTransfer(String fundTransfer) {
		return fundTransfer;
	}

	public double payBill(double payBill) {
		return payBill;
	}
}
