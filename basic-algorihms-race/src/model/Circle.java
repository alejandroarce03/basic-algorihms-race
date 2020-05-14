package model;

public class Circle {
	
	public static int INLARGE=1;
	public static int SHRINK=-1;

	private double radio;
	
	public Circle(double r) {
		radio=r;
	}
	public void inlarge() {
		radio=radio+INLARGE;
	}
	public void shrink() {
		radio=radio+SHRINK;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double r) {
		radio=r;
	}
	
}
