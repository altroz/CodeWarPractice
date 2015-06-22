package problem3;

public class FooCorporation1 {
	
	public static void CalculatePay (double BasePay, int TotalHours){
		double TotalPay = 0;
		
		if(TotalHours > 60){System.out.println("Total work hours cannot exceed more than 60 hours");}
		
		else 
			if(BasePay < 8.0){System.out.println("BasePay cannot be less than $8.00");}
			else 
				if(TotalHours>40){
					TotalPay =(BasePay * 40) + ((TotalHours - 40)*(BasePay *1.5));
					System.out.println("Your Total Pay is: $"+TotalPay);}
		
				else{
					TotalPay = (BasePay * TotalHours);
					System.out.println("Your Total Pay is: $"+TotalPay); }
		} // End of CalculatePay
	
	public static void main(String[]args){
		CalculatePay(7.50,35);
		CalculatePay(8.20, 47);
		CalculatePay(10.00,73);
		CalculatePay(10.00,59);
		CalculatePay(10.00,40);
	}//End of Main Method
}
