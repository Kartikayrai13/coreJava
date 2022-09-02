package OOPPrachiMam;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	//public void setNumber(String number) {
		//this.number = number;
	//}
	//public void setAccountType(String accountType) {
		//this.accountType = accountType;
	//}
	public Account(){
	}
	public Account(String number,String accountType){
		this.number=number;
		this.accountType=accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
