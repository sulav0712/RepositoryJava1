import java.util.Scanner;

public class CategoryDiscount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input marked price
        System.out.print("Enter marked price: ");
        float mp = sc.nextFloat();

        // Input category
        System.out.print("Enter category (A/B/C/D): ");
        char category = sc.next().toUpperCase().charAt(0);

        float discountPercent = 0;

        // Using switch to assign discount
        switch (category) {
            case 'A':
                discountPercent = 60;
                break;

            case 'B':
                discountPercent = 40;
                break;

            case 'C':
                discountPercent = 20;
                break;

            case 'D':
                discountPercent = 10;
                break;

            default:
                System.out.println("Invalid category!");
                return;  // exit the program
        }

        // Calculate selling price
        float sp = mp - (mp * discountPercent / 100);

        // Display result
        System.out.println("Discount Percent: " + discountPercent + "%");
        System.out.println("Selling Price: " + sp);
    }
}