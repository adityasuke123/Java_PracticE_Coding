package Strings;

public class Longest_Palindromic_Substring {
    public static void main(String [] args) {
        String str = "abcdefghgfed";

        String longest = "";

        for(int i = 0; i <= str.length()-1; i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i,j);

                if(sub.equals(new StringBuilder(sub).reverse().toString()) &&
                sub.length() > longest.length()) {
                    longest = sub;
                }
            }

        }
        System.out.println(longest);
    }
}
