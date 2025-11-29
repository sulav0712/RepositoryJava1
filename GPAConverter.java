import java.util.Scanner;

public class GPAConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input GPA
        System.out.print("Enter GPA (0.0 to 4.0): ");
        double gpa = sc.nextDouble();

        // Validate GPA
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA! Please enter a value between 0.0 and 4.0.");
            return;  // exit program
        }

        String grade;

        // GPA to grade conversion
        if (gpa >= 3.7) {
            grade = "A";
        } else if (gpa >= 3.0) {
            grade = "B";
        } else if (gpa >= 2.0) {
            grade = "C";
        } else if (gpa >= 1.0) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output result
        System.out.println("Your grade is: " + grade);
    }
}