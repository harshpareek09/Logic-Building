package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array is: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        ArrayList<Integer> result = new ArrayList<>(size);

        for(int i =0;i<arr.length;i++){
            System.out.print("Enter a number"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        

        System.out.println("\nUser Entered Array is: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);

        System.out.println("\nSorted Array is: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0;i<arr.length;i++){
            int num = arr[i];
            int count =1;

            for(int j = i+1;j<arr.length;j++){
                if(num == arr[j]){
                    count++;
                    break;
                }
            }

            if(count>=2){
                result.add(arr[i]);
            }
        }

        System.out.println(result);


        sc.close();
    }
}
