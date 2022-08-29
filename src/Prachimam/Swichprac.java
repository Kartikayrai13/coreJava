package Prachimam;

public class Swichprac {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chouhan";
		switch (name) {
		case "Vijay":
			System.out.println("First part of the name");
			break;
		case "Dinanath":
			System.out.println("Middle part of the name");
			break;
		case"Chouhan":
		System.out.println("Last part of the name");
		break;
		case"Vijay Dinanath Chouhan":
			System.out.println("Full name");
			break;
		default:
			System.out.println("Name cannot be found");
			break;
		}
	}

}
