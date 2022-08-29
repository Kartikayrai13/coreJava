package OOPSprac; 
public class Automobile {
	private String color=null;
	private int speed=0;
	private String make=null;
	public static int NO_OF_GEARS=0;
	public int changeGear=50;
	public int accelerator;
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public int speed(){
		return speed;
		}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public String make(){
		return make;
	}
	public void getMake(String make){
		this.make=make;
	}
	public int NO_OF_GEARS(int a){
		System.out.println(a);
		return NO_OF_GEARS;
	}
	//public void setChangeGear(int changeGear){
		//this.changeGear=changeGear;
	//}
	public int changeGear(){
		if(speed ==30)
			System.out.println("First gear");
	else if (speed==50){
		System.out.println("Second gear");
	}
		else if(speed==70){
		System.out.println("Third gear");
	}
		else if(speed==100){
		System.out.println("Fourth gear");
	}else{
		System.out.println("fifth gear");
	}
		return changeGear;
	}

		public int accelerator(){
			return accelerator;
			
		}
}
