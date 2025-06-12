package Arrays;
public class FindTripletsSum {
    public static void main(String args[]){
        int arr[] ={7,5,9,3,0,8,6};
        int target = 9;
        boolean flag = false;

        for(int i =0;i<arr.length-2;i++){
            for(int j =i+1;j<arr.length-1;j++){
                for(int k =j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                        flag = true;
                        System.out.println();
                    }
                }
            }
        }

        if(flag==false){
            System.out.println("No triplets found");
        }
    }
}
