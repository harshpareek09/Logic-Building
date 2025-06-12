package Arrays;

import java.util.Scanner;

public class ReverseArrayWithoutNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        //Input
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        //Before Operation Array
        System.out.println("Before Any Operation Arry is");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Reverse Array
        int start = 0;
        int end = size-1;
        while (start<=end) {
            //Swao
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }

        //After Swap 
        System.out.println("Reverse Array is ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        sc.close();
    }
}
