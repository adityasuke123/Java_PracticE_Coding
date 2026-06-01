package Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Common_Char {
    public static void main(String [] args) {
        String s1 = "aditya";
        String s2 = "ditisha";
//.......................................using stream api...........................
//        Set<Character> l1 = s1.chars().mapToObj(x -> (char)x).collect(Collectors.toSet());
//        Set<Character> l2 = s2.chars().mapToObj(x -> (char)x).filter(l1::contains).collect(Collectors.toSet());
//        System.out.println(l2);

//....................................using logical programming.............................
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(char ch : s1.toCharArray()) {
            set1.add(ch);
        }
        for(char ch : s2.toCharArray()) {
            if(set1.contains(ch)) {
                set2.add(ch);
            }
        }
        System.out.println(set2);
    }
}
