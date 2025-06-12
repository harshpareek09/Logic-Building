package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input of array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Array before Operations
        System.out.println("Array Before: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // Logic
        Arrays.sort(arr);

        System.out.println("Array After sorting: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int result = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = arr[i];
            }
        }

        if (max > 1) {
            System.out.println("Number is = " + result + " and Frequency is = " + max);
            System.out.println("=============================================================");
        } else {
            System.out.println("All are unique.");
            System.out.println("=============================================================");
        }
        sc.close();
    }
}
