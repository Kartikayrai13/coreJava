package OOPPrachiMam;

public class Shape {
	private String color;
	private int boderwidth;
	public String getColor() {
		return color;
	}
	public Shape(){
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBoderwidth() {
		return boderwidth;
	}
	public void setBoderwidth(int boderwidth) {
		this.boderwidth = boderwidth;
	}
	public double area(){
		return 0;
	}

	public static Shape getShape(int i){
		if (i==1){
			return new Rectangle();
	}
		if (i==2){
			return new Triangle();
}
		if(i==3){
			return new Circle();
		}
			return new Shape();
	}
	

}
