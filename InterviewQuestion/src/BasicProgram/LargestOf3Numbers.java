package BasicProgram;

public class LargestOf3Numbers {
    static void main() {
        int a = 10, b= 20, c = 30;
        if(a>b && a>c){
            System.out.println(a + "is Largest Number");
        } else if (b>a && b>c) {
            System.out.println(b + "is Largest Number");
        } else {
            System.out.println(c + "is Largest Number");
        }
    }
}
