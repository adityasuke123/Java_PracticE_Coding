package Strings;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {
    public static void main(String [] args) {
        String s = "java is good java is powerful";
//.............................using logical programming.........................
//        Map<String, Integer> map = new HashMap<>();
//
//        String [] s1 = s.split(" ");
//        for(String str : s1) {
//            map.put(str, map.getOrDefault(str, 0)+1);
//        }
//        System.out.println(map);

//..............................using stream api..................................
        Map<String, Long> list = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        System.out.println(list);
    }
}
