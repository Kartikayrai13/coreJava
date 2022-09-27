package ConcurrencyAndThreadPrachiMam;

public class WithThread extends Thread {

	private String Name;

	public WithThread(String Name) {
		this.Name = Name;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " " + Name);
		}

	}
}
