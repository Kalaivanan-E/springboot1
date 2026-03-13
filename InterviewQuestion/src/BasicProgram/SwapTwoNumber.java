package BasicProgram;

public class SwapTwoNumber {
    static void main() {
        int a = 10, b = 20;
        System.out.println("Before Swapping two are .... "+ a+ " " + b);
        // logic 1 using third variable;
/*       int t = a;
        a = b;
        b = t;
*/
        // logic2 using + - operator
        a = a+b; //10+20= 30
        b = a-b; // 30-20 = 10
        a = a -b; // 30 - 10 = 20


        System.out.println("After Swapping two number .... "+ a + " " + b);



    }
}
