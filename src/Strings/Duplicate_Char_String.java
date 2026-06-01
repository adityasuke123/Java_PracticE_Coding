package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_Char_String {
    public static void main(String [] args) {
        String s = "aaddiitbv";
//..................using hashmap.........................................
//        Map<Character, Integer> map = new HashMap<>();

//        for(char ch : s.toCharArray()) {
//            if(ch != ' ') {
//                map.put(ch, map.getOrDefault(ch, 0)+1);
//            }
//        }
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>1) {
//                System.out.print(entry.getKey()+" ");
//            }
//        }
//.........................using streams....................................
//
//            Map<Character, Long> map = s.chars().mapToObj(e -> (char)e)
//                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                    .entrySet().stream().filter(x -> x.getValue() > 1)
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//            System.out.println(map);
//......................................logical approach.........................
    for(int i = 0; i <= s.length()-1; i++) {
        boolean isDuplicate = false;
        for (int j = i + 1; j <= s.length() - 1; j++) {
            if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
                isDuplicate = true;
                break;

            }
        }
        if(!isDuplicate && s.indexOf(s.charAt(i))==i) {
            System.out.print(s.charAt(i)+" ");
        }

    }
    }
}
