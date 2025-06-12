package Arrays;

public class ZerosAtEnd {
    public static void main(String[] args) {
        int arr[] = {8,4,0,-2,6,0,8,3,0,1,0};

        int counter = 0;

        //Put zeros at the 
        for(int i =0;i<arr.length;i++){

            //Check Non -zero Element
            if(arr[i] == 0){
                arr[counter] = arr[i];//Because counter point next non zero position
                counter++;
            }
        }

        //Put zeros at remaining
        for(int i =counter;i<arr.length;i++){
            arr[i] = 0;
        }

        //Print
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
