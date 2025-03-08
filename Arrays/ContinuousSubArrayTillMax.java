package Arrays;

public class ContinuousSubArrayTillMax {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 8, 3, 3, 2, -4, 12}; // Input array
        int target = 10; // Target sum

        int start = -1, end = -1; // Store correct subarray indices
        boolean found = false; // Flag to check if a subarray is found

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i]; // Start a new subarray from index 'i'

            // Expand the subarray
            for (int j = i + 1; j < arr.length; j++) {
                if (sum < target) { // Only update if sum is still below target
                    sum += arr[j];
                    if (sum < target) { // Check again after adding new element
                        start = i;
                        end = j;
                        found = true;
                    }
                } else {
                    break; // Stop if sum exceeds or equals target
                }
            }
        }

        // Print the subarray
        if (found) {
            System.out.print("Subarray is: ");
            for (int i = start; i <= end; i++) { // Include 'end' in the range
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No valid subarray found.");
        }
    }
}
