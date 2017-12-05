package com.nrenaud.kata.string;

/**
 * This exercise could be done in multiple ways :
 * - Standard intuitive one
 * - Java Stream style
 * - With a O(1) in memory storage
 * - With only 1 string scan.
 * - ...
 */
public final class Palindrome {

    /**
     * Indicate if a string is a palindrome or not (eg : "abba" is a palindrome, but not "abbx")
     * This Method is case insensitive (ie : QwEWq = qWEwQ) and ignores spaces (ie : "ab b a" = "a b ba")
     *
     * @param stringToTest the input string to test.
     * @return true only if stringToTest = reverse(stringToTest). A null or empty strings return false.
     */
    public boolean isPalindrome(String stringToTest) {
        if(stringToTest == null  || stringToTest.isEmpty()){
            return false;
        }

        char[] charSeq = stringToTest.toCharArray();
        int high = charSeq.length-1;
        int low = 0;
        while(low < high){
            low = skipSpacesForward(low, charSeq);
            high = skipSpacesBackward(high, charSeq);
            if(Character.toLowerCase(charSeq[low]) == Character.toLowerCase(charSeq[high])){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }

    private static int skipSpacesForward(int index, char[] stringToTest){
        while(stringToTest[index] == ' '){
            index++;
        }

        return index;
    }

    private static int skipSpacesBackward(int index, char[] stringToTest){
        while(stringToTest[index] == ' '){
            index--;
        }

        return index;
    }
}