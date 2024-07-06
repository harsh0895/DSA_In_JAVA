package Arrays;

//2. Write a program to print odd number of values in the given array ?

public class ar_2 {
    public static void main(String[] args) {
        String str[] = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        for( int i=0; i<str.length; i++ ){
            if( i%2!=0 ){
                System.out.println(str[i]+" ");
            }
        }
    }
}
