package problem2;

public class GravityCalculator {
	public static void main(String[]args){
		double gravity = -9.81;
		double intialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		//vt = 0.5at^2 + vt + x
		
		finalPosition = ((0.5*(gravity)*(fallingTime)*(fallingTime)) + (intialVelocity*fallingTime) + (initialPosition));
		
		System.out.println("The objects's " + "position after "+ fallingTime +" seconds is "+ finalPosition+ "m .");
	}
}
