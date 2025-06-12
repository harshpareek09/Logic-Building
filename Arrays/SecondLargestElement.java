package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {2,8,4,13,6,8,15};

        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
            if(arr[j] >arr[j+1]){
               int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }

        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nSecond largest element in array is: ");
        System.out.println(arr[arr.length-2]);
    }
}
