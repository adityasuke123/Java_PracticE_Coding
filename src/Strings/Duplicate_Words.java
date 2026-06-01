package Strings;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_Words {
    public static void main(String [] args) {
        String s = "java is good java is powerful good is";
//....................................using logical programming.........................
//        String [] s1= s.split(" ");
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for(String str : s1) {
//            map.put(str, map.getOrDefault(str, 0)+1);
//        }
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            if(entry.getValue() > 1) {
//                System.out.println(entry.getKey());
//            }
//        }
//....................................using stream api.................................
        List<String> list =  Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        )).entrySet().stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(list);
    }
}
