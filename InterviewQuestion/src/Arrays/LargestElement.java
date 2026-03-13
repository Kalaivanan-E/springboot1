package Arrays;

public class LargestElement {
    static void main() {
        int[] arr= {10,20,30,40,50,80};
        int largest = 0;
        for(int num : arr){
            if(num>largest){
                largest = num;
            }
        }
        System.out.println("The Largest Number in the array is : "+ largest);
    }
}
