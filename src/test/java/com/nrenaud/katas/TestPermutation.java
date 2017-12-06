package com.nrenaud.katas;

import com.nrenaud.kata.string.Permutation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestPermutation {

    private final Permutation permutation = new Permutation();

    @Test
    void testPalindromeEmpty(){
        assertThat(permutation.findPermutation("")).containsExactly("");
    }

    @Test
    void testPalindromeNull(){
        assertThat(permutation.findPermutation(null)).hasSize(0);
    }

    @Test
    void testPalindromeOkOneChar(){
        assertThat(permutation.findPermutation("a")).containsExactly("a");
    }

    @Test
    void testPalindromeOkSameChars(){
        assertThat(permutation.findPermutation("aaaaaa")).containsExactly("aaaaaa");
    }

    @Test
    void testPalindromeClassic(){
        assertThat(permutation.findPermutation("abc")).containsExactlyInAnyOrder("abc", "acb", "bac", "bca", "cab", "cba");
    }

    @Test
    void testPalindromeLarge(){
        assertThat(permutation.findPermutation("abcdefghij")).hasSize(3628800);
    }
}