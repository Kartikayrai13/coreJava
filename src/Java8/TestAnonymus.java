package Java8;

public class TestAnonymus {
	public static void main(String[] args) {
		
		
	//public void createClass() {
		
		CreateAnonymus a=new CreateAnonymus() {

			@Override
			public void cal() {
				System.out.println("class1 overridden");
			}
				
			

			@Override
			public int calT() {
				System.out.println("class2 overridden");
				return 0;
				
				
			}
			};
			a.cal();
			a.calT();
}
}