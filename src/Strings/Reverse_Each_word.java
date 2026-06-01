package Strings;

public class Reverse_Each_word {
    public static void main(String [] args) {
        String str = "aditya shashikant suke";

        String [] str1 = str.split(" ");

        for(int i = str1.length-1; i >= 0; i--) {
            System.out.print(str1[i]+" ");
        }
    }
}
