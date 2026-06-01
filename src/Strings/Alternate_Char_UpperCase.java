package Strings;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Alternate_Char_UpperCase {
    public static void main(String[] args) {
        String s = "aditya shashikant suke";
//.................................logical programming approach....................
//        StringBuilder sb = new StringBuilder();
//        int temp = 0;
//        for(char ch : s.toCharArray()) {
//            if(ch == ' ') {
//                sb.append(ch);
//                temp = 0;
//            }
//            else {
//                if(temp % 2 == 0) {
//                    sb.append(Character.toLowerCase(ch));
//                }
//                else {
//                    sb.append(Character.toUpperCase(ch));
//                }
//                temp++;
//            }
//        }
//        System.out.println(sb);

//...............................stream api approach..........................

       String str = Arrays.stream(s.split(" ")).map(x -> IntStream.range(0, x.length())
               .mapToObj(y -> {
                   char ch = x.charAt(y);
                   return y % 2 == 0
                           ? String.valueOf(Character.toLowerCase(ch)) :
                             String.valueOf(Character.toUpperCase(ch));
               })
               .collect(Collectors.joining())
       )
               .collect(Collectors.joining(" "));
       System.out.println(str);

    }
}