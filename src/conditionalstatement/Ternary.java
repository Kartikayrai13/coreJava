package conditionalstatement;

public class Ternary {
 public static void main(String[] args) {
	System.out.println("start");
	print();
	System.out.println("end");
}
 
 
 public static void print(){
	 System.out.println("Hello World");
	 int a = 10;
	 System.out.println(a);
 }
 
 
 
 public static float pi(){
	 return 3.14f;
 }
 public static void fun1(int a){
	 System.out.println(a+10);
 }
 public static int max(int a,int b,float c){
	 System.out.println("max function run hua");
	 if(a>b){
		 return a;
	 }else {
		 return b;
	 }
 }
 
}
