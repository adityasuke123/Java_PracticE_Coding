package Strings;

public class Shortest_Longest_Word {
    public static void main(String [] args) {
        String s = "java is beautiful language";

        String [] s1 = s.split(" ");
        String shortest = s1[0];
        String longest = s1[0];

        for(String words : s1) {
            if(words.length() < shortest.length()) {
                shortest = words;
            }
            if(words.length() > longest.length()) {
                longest = words;
            }
        }
        System.out.println("shortest :"+shortest);
        System.out.println("longest :"+longest);
    }
}
