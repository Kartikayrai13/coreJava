package ConcurrencyAndThreadPrachiMam;

public class ExWithThread {
	public static void main(String[] args) {
		WithThread wt1=new WithThread("Ram");
		WithThread t=new WithThread("Shyam");
		
		wt1.start();
		t.start();
		
		}
	}

