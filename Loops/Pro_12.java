package Loops;

public class Pro_12 {
    public static void main(String[] args) {

// There is an Arithmetic Progression, First number is 220 and Common Difference is 7.
// So print all the numbers from 220 to 730 which follow the AP.

        int firstNumber = 220;
        int lastNumber = 730;
        int common_difference = 7;

       while( firstNumber<=lastNumber ){
           System.out.println(firstNumber);
           firstNumber = firstNumber + common_difference;
       }

    }
}