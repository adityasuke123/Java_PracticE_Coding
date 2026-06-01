package Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance_Character {
    public static void main(String [] args) {
        String s = "aditya shashi suke";
//        Map<Character, Integer> map = new HashMap<>();
//........................using hashmap.............................
//        for(char ch : s.toCharArray()) {
//            if(ch != ' ') {
//                map.put(ch, map.getOrDefault(ch, 0)+1);
//            }
//        }
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

//....................using streams...................................

           Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                   .entrySet().stream().
                   collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

           System.out.println(map);
    }
}
