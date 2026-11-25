import java.util.Scanner;

public class IT26102484Lab8Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        // Get 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Display array in reverse order
        System.out.println("\nArray in Reverse Order:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        input.close();
    }
}