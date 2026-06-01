package Strings;

public class Count_Char {
    public static void main(String [] args) {
        String s = "Aditya@123";

        int upper = 0;
        int lower = 0;
        int sp_char = 0;
        int digit = 0;

        for(char ch : s.toCharArray()) {
            if(ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                lower++;
            }
            else if(ch >= '0' && ch <= '9') {
                digit++;
            }
            else {
                sp_char++;
            }
        }
        System.out.println("upper :"+upper);
        System.out.println("lower :"+lower);
        System.out.println("sp_char :"+sp_char);
        System.out.println("digit :"+digit);
    }
}
