package ch05;

import java.util.Calendar;

public class StringMeth {
    public static void main(String[] args) {
//        String str = "Amobu0 개발자";
//
//        char charValue = str.charAt(3);
//        System.out.println(charValue);
//
//        int length = str.length();
//        System.out.println(length);

//        String oldStr = "Amobu0 개발자";
//        String newStr = oldStr.replace("개발자", "developer");
//        System.out.println(newStr);

//        String num = "012345-1234567";
//        String value1 = num.substring(0, 6); //012345
//        String value2 = num.substring(7); //1234567

        String num = "XXXXXX-1234567";
        int index1 = num.indexOf("1234567");
        int index2 = num.indexOf("ㄱ");

        boolean result = num.contains("1");
        System.out.println(result);

        String sports = "축구, 배구, 야구, 탁구, 당구";
        String[] sport = sports.split(",");


    }
}
