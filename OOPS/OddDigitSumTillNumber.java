package OOPS;

class Sum{
    public int sum(int n){
        int sum =0;
        int term = 1;

        for(int i =1;i<=n;i++){
             sum = sum+term;
             term = term+2;
        }

        return sum;
    } 
}

public class OddDigitSumTillNumber {
    public static void main(String[] args) {
        Sum obj = new Sum();
        
        System.out.println( "Sum of digits is: "+obj.sum(5));
    }
}
