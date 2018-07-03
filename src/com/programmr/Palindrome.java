package com.programmr;

import java.util.Scanner;

/**
 * Write a program which takes input as string and check if it is palindrome or not.If the string and the reverse of string are same then we say string is palindrome.
 * <p>
 * If string is "level" then the output should be: palindrome
 */
public class Palindrome {

    private static boolean stringIsPolyndrome(String input) {
        char[] stringArray = input.toCharArray();
        for (int i = 0; i < stringArray.length / 2; i++) {
            if (stringArray[i] != stringArray[stringArray.length - i - 1])
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter the word: ");
        String userWord;
        while (true) {
            userWord = new Scanner(System.in).next();
            if (userWord.length() > 0)
                stringIsPolyndrome(userWord);
            System.out.println(stringIsPolyndrome(userWord));
            break;
        }
    }
}
