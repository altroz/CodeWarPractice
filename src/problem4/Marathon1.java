package problem4;

public class Marathon1 {
	public static void main(String[] args) {

		int primaryIndex = 0;
		int secondaryIndex = 0;
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] time = { 357, 273, 58, 329, 100, 402, 388, 275, 243, 334, 412,
				292, 299, 343, 317, 80 };

		primaryIndex = rankFirst(time);
		System.out.println("The winner is: " + names[primaryIndex]
				+ " with the fastest time of " + time[primaryIndex] + " min");

		secondaryIndex=rankSecond(primaryIndex, time);
		System.out.println("The RunnerUp is: " + names[secondaryIndex]
				+ " with the fastest time of " + time[secondaryIndex] + " min");
	}

	public static int rankFirst(int[] time) {

		int firstPlace = time[0];
		int index = -1;
		for (int i = 0; i < time.length; i++) {
			if (firstPlace >= time[i]) {
				firstPlace = time[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int rankSecond(int primaryIndex, int[] time){
		int secondPlace = time[0];
		int index = -1;
	
		for (int i = 0; i < time.length; i++){
			if(i == primaryIndex) continue;
			else if(secondPlace > time[i]){
				secondPlace = time[i];
				index = i;
			}
		}
		return index;
	}
}
