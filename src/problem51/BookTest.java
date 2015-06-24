package problem51;

public class BookTest {
	public static void main(String[] args) {
		Book example = new Book("The Da Vinci Code");
		System.out.println("Borrowed? (should be false): "
				+ example.isBorrowed());
		example.rented();
		System.out.println("Borrowed? (should be true): "
				+ example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (should be false): "
				+ example.isBorrowed());
		System.out
				.println("Borrowed? (should be false): " + example.getTitle());

	}
}
