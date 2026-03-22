package Functional_Interface;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        String message = "Hello Java Students!";


        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        if (length > 10) {
            System.out.println("Message exceeds limit!");
        } else {
            System.out.println("Message is within limit.");
        }

        System.out.println("Length: " + length);
    }
}