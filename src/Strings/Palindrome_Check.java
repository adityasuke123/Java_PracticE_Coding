package Strings;

public class Palindrome_Check {
    public static void main(String [] args) {
        String str = "adaa";
//...............check palindrome using string builder.........................
//        boolean str1 = str.equals(new StringBuilder(str).reverse().toString());
//
//        System.out.println(str1);

//..............check palindrome using string.......................

        String str2 = "";
        for(int i = str.length()-1; i>=0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if(str.equals(str2)) {
            System.out.println(str2+": palindrome");
        }
        else {

            System.out.println(str2+": non  palindrome");
        }
    }
}
