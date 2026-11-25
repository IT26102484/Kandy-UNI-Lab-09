
public class IT26102484Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};

        int[] B = {34, 67, 18, 89, 12};

        int[] C = new int[5];

        // Add arrays A and B
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display array A
        System.out.println("A Array Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

        // Display array B
        System.out.println("\n\nB Array Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        // Display array C
        System.out.println("\n\nC Array Contents (A + B):");

        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
