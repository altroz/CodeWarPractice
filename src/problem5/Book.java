package problem5;

public class Book {
	String title;
	boolean borrowed = false;

	public Book(String bookTitle) {
		title = bookTitle;
	}

	public void borrowed() {
		this.borrowed = true;
		System.out.println("Borrowing "+ title + " ...");
		System.out.println("You successfully borrowed " + title);
	}

	public void returned() {
		this.borrowed = false;
		System.out.println("The book has been returned");
	}

	public boolean isBorrowed() {
		if (this.borrowed == true)
			return true;
		else
			return false;
	
	}

	public String getTitle() {
		return title;
	}
}