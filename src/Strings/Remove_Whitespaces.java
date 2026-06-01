package Strings;

public class Remove_Whitespaces {
    public static void main(String [] args) {
        String s = "aditya shashi suke";

        String s1 = s.replaceAll("\\s","");
        System.out.println(s1);
    }
}
