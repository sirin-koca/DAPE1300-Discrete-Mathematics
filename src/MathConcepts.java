import java.util.Scanner;

public class MathConcepts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        // Prompt the user for an integer input
        System.out.print("Enter an integer value: ");
        n = sc.nextInt();

        // Perform mathematical operations using the user input
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        int pow = (int) Math.pow(n, 2);

        // Show the results
        System.out.println("The sum of the integers from 1 to " + n + " is: " + sum);
        System.out.println("The product of the integers from 1 to " + n + " is: " + product);
        System.out.println(n + " raised to the power of 2 is: " + pow);
    }
}
