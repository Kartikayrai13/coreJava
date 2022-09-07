package OOPPrachiMam;

public class ExMethodOverloading {
	public void add(int a,int b ){
		System.out.println(a+b);
	}
	public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}

	public double add(double a ,int b){
		double c=a+b;
		System.out.println();
		return c;
	}

}
