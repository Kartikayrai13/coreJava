package RaysPrac;
public class Stringappend {
	public static void main (String []args){
		String s= "hello world of good people";
		char c='o';
				int count=0;
				for(int i=0;i<s.length();i++){
					if (c==s.charAt(i)){
						count++;
					System.out.println(count);
					}
				}
}
}