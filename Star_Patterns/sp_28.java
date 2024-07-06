package Star_Patterns;

/*
    1
    2 9
    3 8 10
    4 7 11 14
    5 6 12 13 15
 */

import java.util.Scanner;

public class sp_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int num = i;
            int increment = rows - i + 1;
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += increment;
                increment++;
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
