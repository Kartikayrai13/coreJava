package Java8;

public interface DefaultAndStatic {
	public void  add();
	//default void sub() {
		//System.out.println("Default method executed");
		static void multi() {
			System.out.println("Static method executed");
		}
	}
	

//}
