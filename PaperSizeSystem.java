import java.util.Scanner;

public class PaperSizeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paper size (A0 to A5): ");
        String size = sc.next().toUpperCase();

        String mm = "";
        String inches = "";

        switch (size) {
            case "A0":
                mm = "841 x 1189 mm";
                inches = "33.1 x 46.8 inches";
                break;

            case "A1":
                mm = "594 x 841 mm";
                inches = "23.4 x 33.1 inches";
                break;

            case "A2":
                mm = "420 x 594 mm";
                inches = "16.5 x 23.4 inches";
                break;

            case "A3":
                mm = "297 x 420 mm";
                inches = "11.7 x 16.5 inches";
                break;

            case "A4":
                mm = "210 x 297 mm";
                inches = "8.3 x 11.7 inches";
                break;

            case "A5":
                mm = "148 x 210 mm";
                inches = "5.8 x 8.3 inches";
                break;

            default:
                System.out.println("Invalid paper size! Enter between A0 to A5.");
                return;  // exit the program
        }

        System.out.println("\n--- Paper Size Details ---");
        System.out.println("Paper Size: " + size);
        System.out.println("Dimensions in mm: " + mm);
        System.out.println("Dimensions in inches: " + inches);
    }
}
