
// PRINTING START PATTERNS

public class Main {
    static void space() {
        for ( int i = 1; i <=2 ; i++ ) {
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 5;
        int col = 5;


//        pyramid
        for (int i = 1; i <= row; i++ ) {
           int space = row - i;
           // print space
            for( int j = 1; j <= space; j++ ) {
                System.out.print("   ");
            }
            int star = 2 * i - 1;
            // print star
            for( int k = 1; k <= star; k++ ) {
                System.out.print(" * ");
            }

            System.out.println();
        }


        // reverse pyramid
        for (int i = row; i >= 1; i-- ) {
           int space = row - i;
           // print space
            for( int j = 1; j <= space; j++ ) {
                System.out.print("   ");
            }
            int star = 2 * i - 1;
            // print star
            for( int k = 1; k <= star; k++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        space();

        //        counting pyramid
        for( int i = 1; i <= row; i++ ) {
            int space = row - i;
            for( int j = 1; j <= space; j++ ) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++ ) {
                System.out.print(j+"  ");
            }
            for(int k = i-1; k >= 1; k-- ) {
                System.out.print(k+"  ");
            }
            System.out.println();
        }

        space();
        // upper half
        for( int i = row; i >= 1; i-- ) {
            // upper left
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            // print space
            int space = (2 * row) - (2 * i);
            for( int k = 1; k <= space; k++) {
                System.out.print("   ");
            }
            // upper right
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // bottom half
        for( int i = 1; i <=row; i++ ) {
            // bottom left
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            // print space
            int space = (2 * row) - (2 * i);
            for( int k = 1; k <= space; k++) {
                System.out.print("   ");
            }
            // bottom right
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        space();
//        upper side
        for( int i = 1; i <= row; i++ ) {
            // upper left
            for( int j = 1; j <= i; j++ ) {
                System.out.print(" * ");
            }
            // space
            int space = (2 * row) - (2 * i);
            for( int k = 1; k <= space; k++) {
                System.out.print("   ");
            }
            // upper right
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // bottom
        for( int i = row - 1; i >= 1; i-- ) {
            // upper left
            for( int j = 1; j <= i; j++ ) {
                System.out.print(" * ");
            }
            // space
            int space = (2 * row) - (2 * i);
            for( int k = 1; k <= space; k++) {
                System.out.print("   ");
            }
            // upper right
            for( int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}