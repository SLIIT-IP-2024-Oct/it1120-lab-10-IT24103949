import java.util.Scanner;

public class IT24103949Lab10Q1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark = scanner.nextInt();

        // Use assertion to verify the mark is within the range of 0 to 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");
    }
}
