package Basics;

import java.util.Scanner;

public class DataTypesAndVariables {

    public static void main(String[] args) {
        String language = "java";
        int numberOfApples = 5;

        String dayOfWeek = "Monday";
        System.out.println(dayOfWeek); // Monday

        int one = 1;
        int num = one;
        System.out.println(num); // 1

        //String dayOfWeek = "Monday";
        System.out.println(dayOfWeek); // Monday

        dayOfWeek = "Tuesday";
        System.out.println(dayOfWeek); // Tuesday

        int number = 10;
        number = 11; // ok
        //number = "twelve"; // it does not work!

        // Alternative forms of declaration
        String language2 = "java", version = "8 or newer";

        int age; // declaration
        age = 35; // initialization

        //Type inference
        var language3 = "Java"; // String
        var version3 = 10; // int

        double fehrenheit = 96.8;
        double celsius = (fehrenheit - 32) * 5 / 9;
        System.out.println("Body temperature in Celsius: " + celsius);


        String data1 = "\nHello, world!";
        char data2 = 'H';
        byte data3 = 127;
        int data4 = 2_147_483_647; // 2^31 - 1
        double data5 = 3.1415926;
        boolean data6 = true;
        long data7 = 9_223_372_036_854_775_807L; // 2^63 - 1
        System.out.println("Data1: " + data1);
        System.out.println("Data2: " + data2);
        System.out.println("Data3: " + data3);
        System.out.println("Data4: " + data4);
        System.out.println("Data5: " + data5);
        System.out.println("Data6: " + data6);
        System.out.println("Data7: " + data7);

        double pi = 3.1415;
        float e = 2.71828f;

        char lowerCaseLetter = 'a';
        char upperCaseLetter = 'Q';
        char dollar = '$';

        int num2 = 100;
        long bigNum = num2; // 100L

        long bigNum2 = 100_000_000L;
        double bigFraction = bigNum2; // 100000000.0

        char ch = '?';
        int code = ch; // 63
        System.out.println("charcode ("+ ch + "): " + code);

        double d = 2.00003;
        // it loses the fractional part
        long l =  (long) d; // 2
        System.out.println("l: " + l);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n----------------------\nEnter a number: ");
        double a = scanner.nextDouble();
        int b = (int) a;

        System.out.println(b);

        System.out.println("");

        String language4 = new String("java");

        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println("s2 == s3: " + (s1 == s2)); // false
        System.out.println("s2 == s3: " +  (s2 == s3)); // true
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s2.equals(s3): " + s2.equals(s3)); // true

        System.out.println("");

        String str = null;
        System.out.println(str); // null
        str = "hello";
        System.out.println(str); // hello
    }
}
