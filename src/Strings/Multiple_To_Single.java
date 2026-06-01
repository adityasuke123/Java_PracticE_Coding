package Strings;

public class Multiple_To_Single {
    public static void main(String [] args) {
        String s = "                    aditya      shASHI        SUKE   ";

        String s1 = s.trim().replaceAll("\\s+"," ");
        System.out.println(s1);
    }
}
