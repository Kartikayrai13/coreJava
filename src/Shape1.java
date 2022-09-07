package OOPPrachiMam;

public abstract class Shape1 {
	private String color;
	private int boderwidth;
	public String getColor() {
		return color;
	}
	public Shape1(){
		
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
	public abstract double area();
 }