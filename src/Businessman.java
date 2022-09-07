package OOPPrachiMam;

public class Businessman extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		System.out.println("Help to others");
	}

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("Earn Money");
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Doantion");
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Party");
	}
}