package overridingTest;

public class Point {
	int xPos;
	int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public boolean equals (Point other){
		if(other == null)
			return true;
		else 
			return false;
	}
	
	public static void main(String[]args){
		Point p1 = new Point (50,20);
		Point p2 = new Point (50,150);
		Point p3 = new Point (50,20);
		
		System.out.println("p1 and p2 " + p1.equals(p2));
		System.out.println("p1 and p3 " + p1.equals(p3));
	}
}
