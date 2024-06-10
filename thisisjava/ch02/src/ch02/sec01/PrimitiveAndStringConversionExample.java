package ch02.sec01;

public class PrimitiveAndStringConversionExample {

    static String str;
    public static void main(String[] args) {
        str = "10";
        byte value1 = Byte.parseByte(str);

        str = "200";
        short value2 = Short.parseShort(str);

        str = "3000000";
        int value3 = Integer.parseInt(str);

        str = "400000000000000";
        long value4 = Long.parseLong(str);


    }
}
