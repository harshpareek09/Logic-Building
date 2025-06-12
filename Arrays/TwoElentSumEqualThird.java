package Arrays;
public class TwoElentSumEqualThird {
    public static void main(String[] args) {
        int arr[] ={21,13,47,61,34,40,55,71,87};
        boolean found = false;

        System.out.println("Triplets Result: ");
        for(int i =0;i<arr.length-2;i++){
            for(int j =i+1;j<arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j] == arr[k]){
                        System.out.println("[ "+arr[i]+","+arr[j]+","+arr[k]+" ]");
                        found = true;
                    }
                }
            }
        }

        if(found==false){
            System.out.println("No Triplets found");
        }
    }
}
