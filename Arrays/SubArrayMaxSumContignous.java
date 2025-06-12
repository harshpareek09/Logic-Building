package Arrays;
public class SubArrayMaxSumContignous {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //Initialize the variable
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start =0;int end =0;int tempStart =0;

        for(int i =0;i<arr.length;i++){
            currentSum = currentSum+arr[i];

            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if(currentSum<0){
                currentSum =0;
                tempStart = i+1;
            }
        }
        System.out.print("Subarray is: ");
        for(int i =start;i<end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(maxSum);

    }
    
}
