package Arrays;
import java.util.Scanner;

public class DuplicateUseSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //Taking input in array
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();

        }
        
        System.out.println("Array Before Sorting: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Sorting
        System.out.println("After Sorting Array");
        for(int i =0;i<size-2;i++){//Always size -1 passes

            //For sort the using adjacent element swap approach
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            //Show array
            for(int ele:arr){
                System.out.print(ele+" ");
            }
            System.out.println();

        }

        sc.close();

    }
}
