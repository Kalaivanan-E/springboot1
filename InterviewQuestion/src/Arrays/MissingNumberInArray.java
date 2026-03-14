package Arrays;

public class MissingNumberInArray {
    // Array should not have duplicates
    // Array No need to be sorted order
    // Values should be in range

    static void main() {
        int a[] = {1,2,4,5};
        // 1+2+4+5=12 sum1
        // 1+2+3+4+5=15  sum2
        // sum2 - sum1 = missing number 15-12 = 3;

        int sum1 =0;
        for(int i =0; i<a.length; i++){
            sum1 = sum1 + a[i];
        }
        int sum2 =0;
        for(int i = 1; i<=5; i++){
            sum2 = sum2 + i;
        }
        int missingNo = sum2 - sum1;
        System.out.println("The Missing element in the array : " + missingNo);


        // approach 2

        int arr[] = {1,2,4,5};
        int n = 5;
        int expectedSum = n *(n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum+= num;
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing Number : " + missing);
    }

}
