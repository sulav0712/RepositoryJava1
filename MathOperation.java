
/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
   
    public class MathOperations {

    public static void main(String[] args) {

        // 1. ARITHMETIC OPERATORS
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println();

        // 2. UNARY OPERATORS
        int x = 5;
        System.out.println("Unary Operators:");
        System.out.println("x = " + x);
        System.out.println();

        // 3. ASSIGNMENT OPERATORS
        int y = 20;
        System.out.println("Assignment Operators:");
        System.out.println("y = " + y);
        System.out.println();

        // 4. RELATIONAL OPERATORS
        int p = 7, q = 10;
        System.out.println("Relational Operators:");
        System.out.println("p == q : " + (p == q));
        System.out.println();

        // 5. LOGICAL OPERATORS
        boolean cond1 = true, cond2 = false;
        System.out.println("Logical Operators:");
        System.out.println();

        // 6. TERNARY OPERATOR
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary Operator:");
        System.out.println(num + " is " + result);
    }
}
}