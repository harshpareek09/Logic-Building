package Arrays;

public class OneElementRemoveAtSpecificPosition {
    public static void main(String[] args) {
        int arr[] = {8,80,64,71,-90};
        int pos = 3;

        System.out.println("Array Before Removal: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i = pos-1;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        arr[arr.length-1] = 0;

        System.out.println("Array After Removal of 3rd Element is: ");
        for(int i =0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
