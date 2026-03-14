package BasicProgram;

public class CountEvenAndOddDigits {
    static void main() {
        int num = 1234;
        int even_count = 0;
        int odd_count = 0;
        while (num>0){
            int rem = num%10;
            if(rem%2==0){
                even_count++;
            }else {
                odd_count++;
            }
            num = num/10;
        }
        System.out.println("Even digits : "+ even_count);
        System.out.println("Odd digits : "+ odd_count);
    }
}
