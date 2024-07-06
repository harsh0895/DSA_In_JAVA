package Arrays;

//5. Write a program to find the first peak value from the given array ?

public class ar_5 {
    public static Integer findFirstPeak(int[] arr) {
        int n = arr.length;

        // Check each element except the first and last
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return null; // No peak element found
    }
    public static void main(String[] args) {

        int[] array = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        Integer firstPeak = findFirstPeak(array);
        System.out.println(firstPeak);

    }
}
