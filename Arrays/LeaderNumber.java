package Arrays;

public class LeaderNumber {
    public static void main(String[] args) {
        int arr[] = {14,9,11,7,8,5,3};
        int flag;

        for(int i =0;i<arr.length-1;i++){
            int num = arr[i];
            flag = 1;
            for(int j = i+1;j<arr.length;j++){
                if(num<arr[j]){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(num+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }
}
