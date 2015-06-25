package Chapter01.InheritanceTest;


public class Circle extends Shape{
	
		private int radius;
		public Circle(int r){radius  = r;}
		public double area(){return Math.PI * radius * radius;}
	
}
