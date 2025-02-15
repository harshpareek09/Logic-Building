package Arrays;

import java.util.Scanner;

public class AllPairsOfTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<arr.length;i++){
            System.out.print("Enter a number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a target value: ");
        int target = sc.nextInt();

        for(int i =0;i<arr.length;i++){
            

            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.print("[ "+arr[i]+","+arr[j]+" ]"+"  ");
                }
            }
        }
    }
}
