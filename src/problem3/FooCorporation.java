package problem3;

public class FooCorporation {
	

	public static void CalculatePay(double BasePay, int TotalHours){
		
		if(BasePay<8.0 || TotalHours>60){
			System.out.println("There is an error with either the Pay Base and/or Total Hours");}
		
		else{ if(TotalHours>40){
			System.out.println("The total pay is "+ (40*BasePay)+((TotalHours-40)*(BasePay*1.5)));}
			
		else {System.out.println("The total pay is "+ (BasePay * TotalHours));}}
	}
	
	public static void main(String[]args){
		CalculatePay(8.50, 59);
		CalculatePay(10.00, 59);
		CalculatePay(15.00,59);
		}
		
}//End of Class
