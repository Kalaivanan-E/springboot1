package Arrays;

import java.util.HashSet;

public class DuplicatesNumberInArray {
    static void main() {
        int a[] = {1,2,3,4,2,5};

        // approach 1;
        for(int i =0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicate Numbers ...." + a[i]);
                }
            }
        }

        // approach 2;

        HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            if(!set.add(num)){
                System.out.println("Duplicate Number: " + num);
            }
        }
    }
}
