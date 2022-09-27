package ExceptionPrachiMam;

public class TestAccount extends Account{
	public static void main(String[] args) throws WithdrawalException{
	
			Account a=new Account();
			a.setBalance(500);
			a.withdrawal(2000);
			System.out.println(a.getBalance());
			
		
	}
}
