package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StrictlyIncreasingByRemovingOneElement {

    // Function to check if removing one element can make the list strictly increasing
    public static boolean isStrictlyIncreasing(ArrayList<Integer> arrList) {
        // Try removing each element one by one
        for (int i = 0; i < arrList.size(); i++) {
            // Make a copy of original list and remove element at index i
            ArrayList<Integer> tempList = new ArrayList<>(arrList);
            tempList.remove(i);

            // Check if this new list is strictly increasing
            boolean isIncreasing = true;
            for (int j = 1; j < tempList.size(); j++) {
                if (tempList.get(j) <= tempList.get(j - 1)) {
                    isIncreasing = false;
                    break;
                }
            }

            // If found a valid list, return true
            if (isIncreasing) {
                return true;
            }
        }

        // No such removal made the list strictly increasing
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements to be added: ");
        int n = sc.nextInt();

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayList.add(sc.nextInt());
        }

        // Call the function and print result
        boolean result = isStrictlyIncreasing(arrayList);

        if (result) {
            System.out.println("Yes, it can be made strictly increasing by removing one element.");
        } else {
            System.out.println("No, it cannot be made strictly increasing.");
        }
    }
}
