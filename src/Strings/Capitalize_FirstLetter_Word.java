package Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Capitalize_FirstLetter_Word {
    public static void main(String [] args) {
        String s = "aditya shashi suke";
//...............................using logical programming...............................
//        StringBuilder sb = new StringBuilder();
//        String [] s1 = s.split(" ");
//
//        for(String str : s1) {
//                sb.append(Character.toUpperCase(str.charAt(0)))
//                .append(str.substring(1))
//            .append(" ");
//
//        }
//        System.out.println(sb);

//..........................................using stream api.........................

//        String str = Arrays.stream(s.split(" ")).map(x -> Character.toUpperCase(x.charAt(0))+
//                x.substring(1)+" ").collect(Collectors.joining());
//        System.out.println(str);
    }
}
