package Arrays;

public class MinimumAbsoluteElement {
    public static void main(String[] args) {
        int arr[] = {5,-3,7,-2};

        int min = Integer.MAX_VALUE; int ele_j =0; int ele_i = 0;int diff =0;
        for(int i =0;i<arr.length;i++){
             
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    diff= arr[i]-arr[j];
                
                }
                else{
                    diff = arr[j] - arr[i];
                    
                }

                if(diff<min){
                    min = diff;
                    ele_j = arr[j];
                    ele_i = arr[i];

                }
            }
            
        }
        System.out.println("Minimum ("+ele_i+","+ele_j+") = "+min);
        
        System.out.println();
    }
}
