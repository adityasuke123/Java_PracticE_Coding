package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_Anagram {
    public static void main(String [] args) {
        List<String> list = Arrays.asList("tea","eat","ate","man","nam","tan","ant","nat");

//.........................grouping anagram using stream api........................
//        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(s -> {
//            char [] ch = s.toCharArray();
//            Arrays.sort(ch);
//            return new String(ch);
//
//        }));
//        System.out.println(map);

//.........................grouping anagram using stream api.............................

//            Map<String, List<String>> map1 = list.stream().collect(Collectors.groupingBy(
//                    str -> str.toLowerCase().chars().sorted()
//                            .mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())
//            ));
//
//            System.out.println(map1);
    }

}

