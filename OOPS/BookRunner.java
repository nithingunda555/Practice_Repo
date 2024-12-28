
public class BookRunner {

	public static void main(String[] args) {
		Book artofComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		cleanCode.BookPrinting();

		artofComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);

	}

}
