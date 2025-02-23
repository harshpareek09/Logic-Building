package Arrays;

public class FindSubArrayTarget {
    public static void main(String[] args) {
        int arr[] = {42,15,12,8,6,32};
        int target = 26;

        int sum = 0;
        int start =0;


        for(int i = 0;i<arr.length;i++){
            //Add the Array content
            sum +=arr[i];

            if(sum>target && start<i){
                sum = sum - arr[start];
                start++;

            }

            if(sum == target){
                System.out.print("Sub -Array with target sum is: ");
                for(int j =start;j<=i;j++){
                
                    System.out.print(arr[j]+" ");
                }
            }

        }
    }
}
