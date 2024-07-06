package Arrays;

public class Cloning_array {
    static void print_array(int []arr){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        System.out.println("Elements of arr1: ");
        print_array(arr1);

        int []arr2 = arr1;
        System.out.println("Elements of arr2: ");
        print_array(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("In this case after changing the array elements both the array would be change: ");
        print_array(arr1);
        print_array(arr2);

        System.out.println("But in this case of cloning an array it will change only the elements of arr2: ");
        arr2 = arr1.clone();

        arr2[0] = 6;
        arr2[1] = 7;

        print_array(arr1);
        print_array(arr2);

    }
}
