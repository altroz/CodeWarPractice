package problem5;

public class BookTest {
	public static void main(String[]args){
	/*	
		Library library = new Library("512 S.Spring St");
		library.getLibraryAddress();
		library.getLibraryHours();
		Book example1 = new Book("The Da Vinci Code");
		System.out.println(example1.isBorrowed());
		example1.borrowed();
		System.out.println("Out of Stock: "+example1.isBorrowed());
		example1.returned();
		System.out.println("Out of Stock: "+example1.isBorrowed());*/
		// Created two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		
		//Add four books to the first Library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Price"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		
		//Print Opening hours and the addresses
		System.out.println("Library Hours");
		printOpeningHours();
		System.out.println();
		
		System.out.println("Library Address:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		
		//Try to borrow The Lords of the Rings from both Libraries. 
		System.out.println("Borrowing The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
}
	public static void printOpeningHours(){
		System.out.println("Libraries open at 9 AM and closes at 5 PM");
	}
}