package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String [] args) {
        String s = "adityasuke";
//........................................using stream api.....................
//        String s1 = s.chars().sorted().mapToObj(x -> String.valueOf((char)x)).collect(Collectors.joining());
//
//    System.out.println(s1);

//.......................................using logical programming...........................
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);
        System.out.println(str);
    }
}
