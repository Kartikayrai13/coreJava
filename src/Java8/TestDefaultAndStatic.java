package Java8;

public class TestDefaultAndStatic {		
	//public void create() {
	//public static void main(String[] args) {
		
	DefaultAndStatic d =new DefaultAndStatic() { 
		
		@Override
		public void add() {
			
		//}
	//}; 
	d.add();//
	//d.sub();//default called
	DefaultAndStatic.multi();//static called 
		
	}
};
//};
}
