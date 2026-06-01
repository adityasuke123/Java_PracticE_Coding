package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_Non_Repeating {
    public static void main(String [] args) {
        String s = "adityad";

//.....................using map.............................................
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        for(char ch : s.toCharArray()) {
//            if(ch != ' ') {
//                map.put(ch, map.getOrDefault(ch, 0)+1);
//            }
//        }
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if(entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//                break;
//
//            }
//        }

//..............................using streams............................
        Character ch = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(

                          Function.identity(),
                          LinkedHashMap::new,
                          Collectors.counting()
          )).entrySet().stream().filter(x -> x.getValue()==1)
                  .map(Map.Entry::getKey).findFirst().orElse(null);

            System.out.println(ch);

//.............................first non repeating character...............................
//        for(int i = 0; i <= s.length()-1; i++) {
//            boolean isDuplicate = false;
//            for (int j = i + 1; j <= s.length() - 1; j++) {
//                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
//                    isDuplicate = true;
//                    break;
//
//                }
//            }
//            if(!isDuplicate && s.indexOf(s.charAt(i))==i) {
//                System.out.print(s.charAt(i)+" ");
//                    break;
//            }
//
//        }
    }
}
