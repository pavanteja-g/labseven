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
        else if (n%5==0){
            return "Buzz";
        }
        return Integer.toString(n);
    }
}
