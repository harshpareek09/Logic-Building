package Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int start = arr.length-1;
        int rotate = 2;

        System.out.println("Before Right Rotation Array is: ");
        System.out.print("[ ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("]");

        for(int i =1;i<=rotate;i++){
            for(int j =start;j>0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        System.out.println("After Right Rotation Array is: ");
        System.out.print("[ ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("]");


    }
}
