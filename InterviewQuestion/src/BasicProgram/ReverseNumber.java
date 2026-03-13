package BasicProgram;

public class ReverseNumber {

    static void main() {
        int num = 1234;

        // 1.) using algorithm

        /*int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10; // 0+1234%10 = 4 || 40+3 = 43 || 430+2 = 432 || 4320 + 1 = 4321
            num = num/10; // 1234/10 = 123 || 123/10 = 12 || 12/10 = 1
        }
        */
         // 2.) StringBuffer classs

        StringBuffer sb = new StringBuffer(String.valueOf(num));  // this is convert the num into string
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed Number  is : " + rev);


    }
}
