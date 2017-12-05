package com.nrenaud.katas;

import com.nrenaud.kata.string.Palindrome;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TestPalindrome {

    private final Palindrome palindrome = new Palindrome();

    @Test
    void testPalindromeOkClassic(){
        assertThat(palindrome.isPalindrome("a")).isTrue();
        assertThat(palindrome.isPalindrome("aaaaaaaaaaaaaaa")).isTrue();
        assertThat(palindrome.isPalindrome("treert")).isTrue();
        assertThat(palindrome.isPalindrome("trexert")).isTrue();
        assertThat(palindrome.isPalindrome("qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdsapoiuytrewq")).isTrue();
    }

    @Test
    void testPalindromeOkCase(){
        assertThat(palindrome.isPalindrome("AaBbAA")).isTrue();
    }

    @Test
    void testPalindromeOkSpecialChar(){
        assertThat(palindrome.isPalindrome("ééÈéé")).isTrue();
        assertThat(palindrome.isPalindrome("èÈ")).isTrue();
    }

    @Test
    void testPalindromeOkBlankSpaces(){

        assertThat(palindrome.isPalindrome("  a b ba      ")).isTrue();
        assertThat(palindrome.isPalindrome("a b ba")).isTrue();
        assertThat(palindrome.isPalindrome("a                   b ba")).isTrue();
    }

    @Test
    void testPalindromeKo(){
        assertThat(palindrome.isPalindrome("")).isFalse();
        assertThat(palindrome.isPalindrome(null)).isFalse();
        assertThat(palindrome.isPalindrome("ab")).isFalse();
        assertThat(palindrome.isPalindrome("abab")).isFalse();
        assertThat(palindrome.isPalindrome("xxxxxxxxxxxxxxxxxxxxxxabxxxxxxxxxxxxxxxxxxxxxx")).isFalse();
        assertThat(palindrome.isPalindrome("éÈ")).isFalse();
    }
}