package problem5;

public class BookTest {
	public static void main(String[]args){
		Book example1 = new Book("The Da Vinci Code");
		System.out.println(example1.isBorrowed());
		example1.borrowed();
		System.out.println("Out of Stock: "+example1.isBorrowed());
		example1.returned();
		System.out.println("Out of Stock: "+example1.isBorrowed());
}
}