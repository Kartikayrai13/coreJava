package ExceptionPrachiMam;

public class TestLoginException {
	public static void main(String[] args) {
		auth("Vijay");

	}

private static void auth(String username){
	if(!username.equals("admin")){
		LoginException e=new LoginException();
		try{
			throw e;
		}catch(LoginException e1){
			System.out.println(e1.getMessage());
		}
		
	}
}
}
