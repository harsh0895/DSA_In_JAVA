public class checkWords {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        if( str == null || str.length() == 0) {
            System.out.println("strings character not found!");
        }
        int count = 0;
        int words = 1;
        for( int i=0; i < str.length(); i++ ) {
            count++;
            if( str.charAt(i) == ' ' ) {
                count = 0;
                words++;
            }
        }
        System.out.println(words);
    }
}
