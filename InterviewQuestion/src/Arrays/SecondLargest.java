package Arrays;

public class SecondLargest {
    static void main() {
        int[] arr= {10,20,30,40,50,80};
        int largest = 0;
        int second = 0;
        for(int num : arr){
            if(num>largest){
                largest = num;
            }
            else if (num>second && num != largest){
                second = num;
            }
        }
        System.out.println("The Second Largest number in array is :  "+ second);
    }
}
