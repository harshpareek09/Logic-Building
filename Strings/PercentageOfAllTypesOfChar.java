package Strings;

public class PercentageOfAllTypesOfChar {
    public static void main(String[] args) {
        String str = "Tiger RUNS @ In the forest with THE SPEED of 100 km/HOUR.";
        int upper = 0; 
        int lower = 0; 
        int digit = 0; 
        int special = 0;

        for(int i =0;i<str.length();i++){

            int ch = str.charAt(i);

            if(ch>=65 && ch<=90){
                upper++;
            }
            else if(ch>=97 && ch<=122){
                lower++;
            }
            else if(ch>=48 && ch<=57){
                digit++;
            }
            else{
                special++;
            }
        }

        System.out.println("Percentage of UPPERCASE characters: "+(((double)upper/str.length())*100)+" %.");
        System.out.println("Percentage of LOWERCASE characters: "+(((double)lower/str.length())*100)+" %.");
        System.out.println("Percentage of Digits are: "+(((double)digit/str.length())*100)+" %.");
        System.out.println("Percentage of SPECIAL characters: "+(((double)special/str.length())*100)+" %.");


    }
}
