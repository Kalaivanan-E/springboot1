package BasicProgram;

public class PalindromeNumber {
    static void main() {
        int num = 121;
        int original = num;
        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(original == rev){
            System.out.println("The given number is palindrome");
        }else {
            System.out.println("The given number is not palindrome");
        }
    }
}
