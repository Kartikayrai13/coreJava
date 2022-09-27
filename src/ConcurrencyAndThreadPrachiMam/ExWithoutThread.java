package ConcurrencyAndThreadPrachiMam;

public class ExWithoutThread {
	public static void main(String[] args) {
		WithoutThread wt1=new WithoutThread("Ram");
		WithoutThread wt2=new WithoutThread("Shyam");
		wt1.run();
		wt2.run();
		
	}

}
