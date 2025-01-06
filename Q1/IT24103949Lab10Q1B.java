import java.util.Scanner;

public class IT24103949Lab10Q1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark = scanner.nextInt();

        // Use assertion to verify the mark is within the range of 0 to 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Use assertion to verify the grade assigned
        assert (grade == 'A' && mark >= 75) ||
               (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) ||
               (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("Mark is Validated. Grade: " + grade);
    }
}
