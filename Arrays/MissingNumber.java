package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        ArrayList<Integer> result= new ArrayList<>();

        //Taking input in Array
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter a number"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        
       Arrays.sort(arr);
        System.out.println("Missing numbers is: ");
        //Find missing number
        for(int i =0;i<arr.length-1;i++){
            for(int j = arr[i]+1;j<arr[i+1];j++){
                result.add(j);
            }
        }

        System.out.println(result);
        sc.close();

    }
}
