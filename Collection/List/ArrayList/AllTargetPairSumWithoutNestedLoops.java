package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllTargetPairSumWithoutNestedLoops {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 7, -1, 0, 1));
        int target = 6;

        Collections.sort(arrList); // -1,0,1,2,3,4,5,7

        int start = 0;
        int end = arrList.size()-1;

        while(start<end){
            int sum = arrList.get(start)+arrList.get(end);

            if(sum == target){
                System.out.println("( "+arrList.get(start)+" , "+arrList.get(end)+" )");
                start++;
                end--;
            } else if (start < end) {
                start++;
            } else{
                end--;
            }
        }

    }
}
