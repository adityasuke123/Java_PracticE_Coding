package Strings;

public class Check_Only_Digits {
    public static void main(String [] args) {
        String s = "adi123";
//................................using logical programming.........................
//        boolean isDigits = true;
//        for(char ch : s.toCharArray()) {
//            if(ch < '0' || ch > '9') {
//                isDigits = false;
//                break;
//            }
//        }
//
//        System.out.println(isDigits);
//...............................using stream api.......................................
//        boolean isDigit = s.chars().allMatch(Character::isDigit);
//        System.out.println(isDigit);
    }
}
