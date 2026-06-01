package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Check_Anagram {
    public static void main(String [] args) {
        String s1 = "eat";
        String s2 = "tea";
//................................using logical programming approach....................
//        char [] ch = s.toCharArray();
//        char [] ch1 = s1.toCharArray();
//
//        Arrays.sort(ch);
//        Arrays.sort(ch1);
//
//        boolean anagram = Arrays.equals(ch, ch1);
//
//        System.out.println(anagram);

//..............................stream api...........................................
//
//           boolean anagram = Arrays.equals(s1.toLowerCase().chars().sorted().toArray(),
//                   s2.toLowerCase().chars().sorted().toArray());
//
//           System.out.println(anagram);
//.....................................stream api.................................

//            boolean anagram = s1.chars().mapToObj(c -> (char)c).collect(
//                    Collectors.groupingBy(Function.identity(), Collectors.counting())
//            ).equals(
//                    s2.chars().mapToObj(c -> (char)c).collect(
//                    Collectors.groupingBy(Function.identity(), Collectors.counting())
//            ));
//            System.out.println(anagram);

    }
}
