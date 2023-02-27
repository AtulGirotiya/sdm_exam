import java.util.Scanner;

public class FactorialOfGivenNo {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else if (num == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            System.out.println("The factorial of " + num + " is " + factorial(num) + ".");
        }
    }
}
