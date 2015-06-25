package Chapter01.InheritanceTest;

public class Square extends Shape{
	private int side;
	public Square(int a){side=a;}
	public double area() {return side*side;}
}
