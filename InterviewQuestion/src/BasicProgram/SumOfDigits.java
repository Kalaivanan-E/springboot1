package BasicProgram;

public class SumOfDigits {
    static void main() {
        int num = 1234;
        int sum =0;
        while (num>0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of digits  : "+ sum);
    }
}
