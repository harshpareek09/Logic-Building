package Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int rotate = 2;

        System.out.println("Before Rotation Array is: ");
        System.out.print("[ ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ]");

        for(int i =1;i<=rotate;i++){
            for(int j = 0;j<arr.length-1;j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println("After Rotation Array is: ");
        System.out.print("[ ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ]");
    }
}
