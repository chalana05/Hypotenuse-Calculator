import java.util.Scanner;

// Main class of the program
public class Main {
    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Declare variables for the two sides (x, y) and the hypotenuse (z)
        double x;
        double y;
        double z;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first side (x) of the triangle
        System.out.print("Enter side x: ");
        x = scanner.nextDouble();  // Store input in variable x

        // Prompt user to enter the second side (y) of the triangle
        System.out.print("Enter side y: ");
        y = scanner.nextDouble();  // Store input in variable y

        // Calculate the hypotenuse (z) using the Pythagorean theorem: z = sqrt(x^2 + y^2)
        z = Math.sqrt((x * x) + (y * y));

        // Print the result (the hypotenuse)
        System.out.println("The hypotenuse is: " + z);
    }
}
