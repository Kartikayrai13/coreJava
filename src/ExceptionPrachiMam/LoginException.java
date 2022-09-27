package ExceptionPrachiMam;

//public class LoginException{
	//public LoginException() {
	//}

//}
public class LoginException extends RuntimeException{
	public LoginException() {
	super("User not found");
	}
	
}