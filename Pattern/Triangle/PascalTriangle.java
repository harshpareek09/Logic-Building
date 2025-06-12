package Pattern.Triangle;
public class PascalTriangle {
    public static void main(String[] args) {
        int row = 6;
        int arr[] = new int[row];
        int space = row-1;

        for(int i =0;i<row;i++){
            //Space
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }

            //Numbers
            for(int j = i;j>=0;j--){
                if(j==i||j==0){
                    arr[j] = 1;
                }
                else{
                    arr[j] = arr[j]+arr[j-1];
                }
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            space--;
        }
    }
}
