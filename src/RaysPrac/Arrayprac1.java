package RaysPrac;

public class Arrayprac1 {
	public static void main (String []args){
		String[] a= {"Rahul","Reena","Shyam"};
		for(int i=0;i<=a.length;i++){
			String s=args[i];
			for (int j = 0; j < a.length; j++) {
				System.out.print(s.charAt(j));
			}
		System.out.println(i);
		}
		}
}
