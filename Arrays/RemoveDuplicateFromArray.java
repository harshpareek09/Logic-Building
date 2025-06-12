package Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] ={1,2,1,2,1,2};
        int result[] = new int[arr.length];
        int targetIndex =0;

        for(int i =0;i<arr.length;i++){
            int flag = 0;//Not present
            int num = arr[i];

            for(int j =0;j<result.length;j++){
                if(num==result[j]){
                    flag =1;
                    break;
                }
            }

            if(flag==0){
                result[i] =num;
                targetIndex++;
            }
        }

        System.out.print("Unique Elements: ");
        for(int i=0;i<targetIndex;i++){
            System.out.print(result[i]+" ");
        }
    }
}
