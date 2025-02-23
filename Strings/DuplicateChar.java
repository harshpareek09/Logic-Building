package Strings;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Butter Better";

        //Conert into Lowercase
        str = str.toLowerCase();

        for(int i =0;i<str.length();i++){
            boolean flag = false;
            char ch = str.charAt(i);
                for(int j = i+1;j<str.length();j++){
                    if(ch == str.charAt(j)){
                        flag =true;
                        break;
                    }
                }
                if(flag == true){
                    System.out.print("Duplicate element is: "+ch+" ");
                }
        }
    }
}
