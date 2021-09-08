import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double prod = 1;
        while (x > 1) {
            prod *= x;
            x--;
        }
        return prod;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int n = 0;

        while (Math.abs(Math.E - e) > 0.00000000001) {
            e += (1.0/factorial(n));
            n++;
        }

        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x/x1) / 2;
        }

        return x1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
        System.out.println("Enter a positive number!");
        double z = scan.nextDouble();

        while (z <= 0) {
            System.out.println("Enter a positive number!");
            z = scan.nextDouble();
        }

        System.out.println("The squareroot of " + z + " is " + babylonian(z));

        System.out.println("The value of e is roughly : " + calculateE());

        scan.close();
    }
}