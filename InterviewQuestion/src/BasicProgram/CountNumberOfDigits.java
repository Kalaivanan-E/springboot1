package BasicProgram;

public class CountNumberOfDigits {
    static void main() {
        int num = 849483910;
        int count = 0;
        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits : " + count);
    }
}
