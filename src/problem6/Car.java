package problem6;

public class Car {
	private int licensePlate;
	private String model;
	private int VIN;
	
	public Car(int licensePlate, String model, int VIN){
		licensePlate = this.licensePlate;
		model = this.model;
		VIN = this.VIN;	}
	
	public void information(){
		System.out.println(licensePlate + " "+ model + " "+ VIN);
	} 
	
}
