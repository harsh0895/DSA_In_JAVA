package Strings;

// 2. Write a program to print convert the lower character in uppercase and uppercase to lower case in the given string ?

public class str_6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("PHysicS");
        System.out.println(str);

        for( int i=0; i<str.length(); i++ ){
            boolean flag = true; // true-> capital!
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if( ch == ' ') continue;
            if( ascii>=97){
                flag = false;
            }
            if( flag==true ){
                ascii += 32;
                char c = (char)ascii;
                str.setCharAt(i,c);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
