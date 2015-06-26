package overridingTest;

public class PointTest {
	private int xPos, yPos;
	
	public PointTest(int x, int y){
		xPos = x;
		yPos = y;
	}
	
	public boolean equals(Object other){
		if(other==null)
			return false;
		
		if(other instanceof Point){
			Point anotherPoint = (Point)other;
			if((xPos == anotherPoint.xPos)&&(yPos == anotherPoint.yPos))
				return true;
		}
		return false;
		
	}
	
	public static void main(String[]args){
		Object p1 = new Point(10,20);
		Object p2 = new Point(50,100);
		Object p3 = new Point(10,20);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
