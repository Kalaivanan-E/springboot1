package Arrays;

public class LinearSearch {
    static void main() {
        int arr[] = {10,20,30,40,50};
        int target = 10;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("The element found in the index of : " + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("The element not found in the array....");
        }

    }
}
