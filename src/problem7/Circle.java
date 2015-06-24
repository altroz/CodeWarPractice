package problem7;
// A 2D Circle class with xPos and yPos fields to store 
// the coordinates for center point and radius field to store
// the radius value of the circle. 
public class Circle {
	private int xPos, yPos, radius;
	// default constructor initializing all the three fields
	public Circle(){
		xPos = 20; // assume some default values xPos and yPos
		yPos = 20;
		radius = 10; // default radius
	}
	// overridden toString method to print info on 
	// Circle object in String form
	
	public String toString(){
		return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
	}
	
	public static void main(String[]args){
		//Passing a object to println automatically invokes the toString method
		System.out.println(new Circle());
	}
}
