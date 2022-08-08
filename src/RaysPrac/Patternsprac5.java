package RaysPrac;

public class Patternsprac5 {
	public static void main(String[]args){
		int n=4;
		//outerloop
		for(int i=1;i<=n;i++){
			//outerloop for spaces
			for(int j=1;j<=n-1;j++){
				System.out.print(" ");
			}
		//inner loop for stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
		}
			System.out.println();
		}
}
}