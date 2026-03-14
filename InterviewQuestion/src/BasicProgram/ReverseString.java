package BasicProgram;

public class ReverseString {
    static void main() {
        String str = "Java";

        //1) using + (string concatenation) operator
//        String rev = "";
//        for(int i = str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reversed String : " + rev);

        // 2) using string buffer class

        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed String : " + rev);
    }
}
