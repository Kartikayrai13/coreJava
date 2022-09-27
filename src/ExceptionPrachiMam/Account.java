package ExceptionPrachiMam;

public class Account {
	private String number;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	public double withdrawal(double amount) throws WithdrawalException {
		balance -= amount;
		if(balance<500){
		WithdrawalException w=new WithdrawalException();
		//try{
			throw w;
		//}catch(WithdrawalException w1){
		//System.out.println("Insufficient Balance");
		//System.exit(1);
		}
	//}
		return balance;
	}
}