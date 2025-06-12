package Strings;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Butter Better";

        // Convert to lowercase for uniformity
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            char ch = str.charAt(i);
            boolean isPrinted = false;

            // Check if this character appears again in the remaining string
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Check if this character has already been printed
            for (int j = 0; j < i; j++) {  
                if (str.charAt(j) == ch) {
                    isPrinted = true;
                    break;
                }
            }

            // Print the character only if it's a duplicate and not already printed
            if (isDuplicate == true && isPrinted == false) {
                System.out.println("Duplicate character: "+ch);
            }
        }
        
    }
}
