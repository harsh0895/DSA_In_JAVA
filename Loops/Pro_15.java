package Loops;

public class Pro_15 {
    static int checkArmstrong( int num, int digit ){
        int ans = 0;
        while ( num!=0 )
        {
            int rem = num%10;
            num = num/10;
            int i=1;
            int power = 1;
            while (i<=digit )
            {
                power=power*rem;
                i++;
            }
            ans = power + ans;
        }
        return ans;
    }
    public static void main(String[] args) {

        int num = 153;
        int digit = 3;
        int check = checkArmstrong(num, digit);
        System.out.println(check);
        if( check == num ){
            System.out.println("This is armstrong number!");
        }else{
            System.out.println("This is not a armstrong number!");
        }
    }
}
