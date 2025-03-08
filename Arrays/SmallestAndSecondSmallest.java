package Arrays;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int arr[] = new int[]{17,11,23,64,41,88,35};

        //Array is
        System.out.println("Array is: ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Sort the Array
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Second Smallest and Smallest 
        System.out.println("Smallest in array is: "+arr[0]);
        System.out.println("Second smallest in array is "+arr[1]); 
    }
}
