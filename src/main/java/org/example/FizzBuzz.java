package org.example;


public class FizzBuzz  {
    public static String fizzBuzz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(i);
    }
}