package com.nrenaud.katas.string;

public interface Palindrome {

    /**
     * Indicate if a string is a palindrome or not (eg : "abba" is a palindrome, but not "abbx")
     * This Method is case insensitive (ie : QwEWq = qWEwQ) and ignores spaces (ie : "ab b a" = "a b ba")
     *
     * @param stringToTest the input string to test.
     * @return true only if stringToTest = reverse(stringToTest). A null or empty strings return false.
     */
    boolean isPalindrome(String stringToTest);
}