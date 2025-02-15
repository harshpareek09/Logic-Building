package Arrays;

public class CheckArrayEquality {
    public static void main(String[] args) {
        int arrOne[] = {2,5,0,7,6};
        int arrTwo[] = {2,5,1,7,6};
        boolean flag = true;

        if(arrOne.length != arrTwo.length){
            System.out.println("Array on e are not equal to Array 2");
        }
        else{
            for(int i =0;i<arrOne.length;i++){
                if(arrOne[i] != arrTwo[i]){
                    flag = false;
                    break;
                }
            }
        }

        if(flag == true){
            System.out.println("Both array are Equal to each other");
        }
        else{
            System.out.println("Both array are not Equal to each other");
        }
    }
}
