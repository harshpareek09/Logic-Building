package Strings;

public class SwapTwoStringsWithoutThirdVariable {
    public static void main(String[] args) {
        String one = "java";
        String two = "python";

        System.out.println("String One Before swap: "+one);
        System.out.println("String Two Before swap: "+two);
        //One = "Java" and Two = "python"

        two = two+one;// two = "pythonjava"
        one = two.substring(0,two.length()-one.length());//Python
        two = two.substring(6,two.length());//Java

        System.out.println();
        System.out.println("String One After swap: "+one);
        System.out.println("String Two After swap: "+two);


        
    }
}
