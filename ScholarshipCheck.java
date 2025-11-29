import java.util.Scanner;

public class ScholarshipCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Attitude Score (1–10): ");
        int attitude = sc.nextInt();

        System.out.println("\n--- Scholarship Eligibility Result ---");

        // Nested if structure
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("Student is eligible for scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be less than 5.");
                }
            } else {
                System.out.println("Not eligible: Attendance must be above 80%.");
            }
        } else {
            System.out.println("Not eligible: GPA must be at least 3.2.");
        }
    }
}