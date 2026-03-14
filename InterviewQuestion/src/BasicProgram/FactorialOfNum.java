package BasicProgram;

public class FactorialOfNum {
    static void main() {
        int num = 5;
        int fact = 1;
        for(int i =1; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of Given number is : "+ fact);
    }
}
