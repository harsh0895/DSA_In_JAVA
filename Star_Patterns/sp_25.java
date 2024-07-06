package Star_Patterns;

import java.util.Scanner;

/*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
 */

public class sp_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= 2 * row - 1; i++) {
            // Iterate through columns
            for (int j = 1; j <= 2 * row - 1; j++) {

                // Find the minimum distance to the boundary
                int distanceToBoundary = i;
                if (j < distanceToBoundary) {
                    distanceToBoundary = j;
                }
                if (2 * row - i < distanceToBoundary) {
                    distanceToBoundary = 2 * row - i;
                }
                if (2 * row - j < distanceToBoundary) {
                    distanceToBoundary = 2 * row - j;
                }
                // Print the number based on the distance to the boundary
                System.out.print(row - distanceToBoundary + " ");
            }
            System.out.println();
        }
    }
}
