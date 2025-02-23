package Arrays;

public class ZerosAtStart {
    public static void main(String[] args) {
        int arr[] = {8,4,0,-2,6,0,8,3,0,1,0};

        //Counter aasign withend of length because we put non-zeros at end
        int counter = arr.length-1;

        //Transvarese array from End-->Start
        for(int i =counter;i>=0;i--){

            if(arr[i]!=0){
                arr[counter] = arr[i];
                counter--;
            }
        }

        //Put zeros at start
        for(int i =counter;i>=0;i--){
            arr[i] =0;
        }

        //Print
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
