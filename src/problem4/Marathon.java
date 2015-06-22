package problem4;

public class Marathon {

	public static void Rank() {
		String[] Names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] Minutes = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334,
				412, 393, 299, 343, 317, 265 };

		int PrimaryPlace=Minutes[0];
		String winner = " ";
		int SecondaryPlace=Minutes[0];
		String runnerup = " ";
		
		for (int i = 0; i < Minutes.length; i++) {
		
			if (PrimaryPlace > Minutes[i]) {
				PrimaryPlace = Minutes[i];
				winner = Names[i];
			} 
			else if (Minutes[i] != PrimaryPlace && SecondaryPlace > Minutes[i]) {
				SecondaryPlace = Minutes[i];
				runnerup = Names[i];
			}
		}
		System.out.println("The Fastest Minute is: " + PrimaryPlace + " min. The Winner is: " + winner);
		System.out.println("The Second Fastest Minute is: " + SecondaryPlace + " min. The Runnerup is: " + runnerup);
	}

	public static void main(String[] args) {
		Rank();
	}
}
