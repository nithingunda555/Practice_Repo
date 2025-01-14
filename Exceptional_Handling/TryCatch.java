import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    //to print class and name of the exception if any mismatch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getClass().getName());
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
