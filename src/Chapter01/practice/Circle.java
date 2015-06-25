package Chapter01.practice;

public class Circle {
	private int xPos;
	private int yPos;
	private int radius;
	
	public Circle (int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	public Circle(int x, int y){
		this( x,  y, 10);
	}
	
	public Circle(){
		this(20,20,10);
	}
	public String toString(){
		return "center = ("+ xPos+ ", " + yPos + ") and radius = "+ radius;
	}
}
