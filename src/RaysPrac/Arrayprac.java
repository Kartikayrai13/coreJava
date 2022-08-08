package RaysPrac;

public class Arrayprac {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String s=args[i];
			for(int j=s.length()-1;j>=0;j--){
				System.out.print(s.charAt(j));
			}
		
		System.out.println();
		}
	}
}
