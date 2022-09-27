package ConcurrencyAndThreadPrachiMam;

public class WithoutThread {
private String Name;
public WithoutThread(String Name) {
	this.Name=Name;
	
}
public String getName() {
	return Name;

}
public void run() {
	for (int i = 0; i < 50; i++) {
		System.out.println(i+" "+Name);
		
	}

	}
}

