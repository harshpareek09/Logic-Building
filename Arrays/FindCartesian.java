package Arrays;

public class FindCartesian {
    public static void main(String[] args) {
        int arr_one[] = {1,4,6,5,2,1,2};
        int arr_two[] = {1,8,7,5,3,6,4};


        System.out.print("Cartesian Between Two Arrays Are------>");
        for(int i =0;i<arr_one.length;i++){
            for(int j =0;j<arr_two.length;j++){
                if(arr_one[i] == arr_two[j]){
                    System.out.print(arr_one[i]+" ");
                    break;
                    
                }

            }
        }
    }
}
