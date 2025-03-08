package Arrays;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        boolean sorted = true;

        //Taking input in array
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();

        }

        //Check array is sorted or not
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }

        if(sorted == true){
            System.out.println("Array is sorted..");
        }else{
            System.out.println("Array is unsorted!!!");
        }
        sc.close();
    }
}
