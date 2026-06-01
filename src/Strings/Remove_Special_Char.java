package Strings;

public class Remove_Special_Char {
    public static void main(String [] args) {
        String s = "aditya#is@good!";

        for(int i = 0; i <= s.length()-1; i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                System.out.print(ch);
            }
        }
    }
}
