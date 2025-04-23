package OOPS;

import java.util.Scanner;

public class SecondLargestAndLargest {
    public static void main(String[] args) {
        int arr[]  = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        Programmable obj = new Programmable();

        int result[] = new int[2];
        result = obj.checkSecondAndLargest(arr);

        for(int j:result){
            System.out.print(j+" ");
        }

    }
}

class Programmable{
    public int[] checkSecondAndLargest(int arr[]){
        int result[] = new int[2];

        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        result[0] = arr[arr.length-1];
        result[1] = arr[arr.length-2];


        return result;
    }
}
