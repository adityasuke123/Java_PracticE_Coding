package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Group_Starting_Alphabet {
    public static void main(String [] args) {
        List<String> list =
                Arrays.asList("eat","ate","man","nam","tea");

     Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(
             str -> {
                 char [] ch = str.toCharArray();
                         Arrays.sort(ch);
                         return new String(ch);

             }
     ));

System.out.println(map);
    }
}
