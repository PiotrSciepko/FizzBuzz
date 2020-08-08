package com.PiotrS;

public class FizzBuzz {

    public static void main(String[] args) {

        String str;
        for(int i = 1; i <= 100; i++) {
            str = "";
            if (i % 3 == 0) str = "Fizz";
            if (i % 5 == 0) str += "Buzz";
            if (str.isEmpty()) str += i;
            System.out.println(str);
        }

    }
}

