package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( fizzBuzz(3) );
    }

    public static String fizzBuzz(int n) {

        if (n % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(n);
    }
}
