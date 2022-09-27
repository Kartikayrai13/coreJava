package ExceptionPrachiMam;

public class WithdrawalException extends Exception {
	public WithdrawalException() {
		super("you cannot withdraw money");
	}

}
