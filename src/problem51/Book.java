package problem51;

public class Book {
	String Title;
	boolean borrowed = false;

	Book(String bookTitle) {
		bookTitle = Title;
	}

	public void setTitle(String newTitle) {
		newTitle = Title;
	}

	public String getTitle() {
		return Title;
	}

	public boolean isBorrowed() {
		if (borrowed == false) {
			return false;
		} else
			return true;
	}

	public void rented() {
		System.out.println("Processing ... ");
		System.out.println("Congratulation and thank you.");
		borrowed = true;
	}

	public void returned() {
		System.out.println("Processing ...");
		System.out.println("Thank you for returning the book.");
		borrowed = false;
	}

}
