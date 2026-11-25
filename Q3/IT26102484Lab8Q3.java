
import java.util.Scanner;

public class IT26102484Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        // Input 6 positive numbers
        for (int i = 0; i < 6; i++) {

            System.out.print("Enter Positive Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            // Check whether number is positive
            while (numbers[i] <= 0) {

                System.out.println("Error: Please Enter Only Positive Numbers");

                System.out.print("Enter Positive Number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
        }

        // Find maximum number
        int max = numbers[0];

        for (int i = 1; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display array contents
        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display maximum number
        System.out.println("\n\nThe Maximum Number is: " + max);

        input.close();
    }
}
