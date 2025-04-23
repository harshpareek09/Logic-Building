package OOPS;

public class LargestOfThree{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -79;
        int num3 = 40;

        double number1 = 0.89;
        double number2 = -7.8;
        double number3 = -7.8;

        LargOfThree obj = new LargOfThree();
        System.out.println("Maximu number is: "+obj.max(num1, num2, num3));
        System.out.println("________________________________________________________");
        System.out.println("Maximum number is: "+obj.max(number1, number2, number3));
        System.out.println("________________________________________________________");




    }
}


class LargOfThree {

    public int max(int num1,int num2,int num3){
        if(num1>num2&&num1>num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else if(num3>num1 && num3>num2){
            return num3;
        }

        return 0;
    }

    public double max(double number1,double number2,double number3){
        if(number1>number2&&number1>number3){
            return number1;
        }
        else if(number2>number1 && number2>number3){
            return number2;
        }
        else if(number3>number1 && number3>number2){
            return number3;
        }
        return 0.0;
    }
}
