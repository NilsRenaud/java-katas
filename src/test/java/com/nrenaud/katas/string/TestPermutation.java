package com.nrenaud.katas.string;

import com.nrenaud.katas.string.solution.PermutationSolution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestPermutation {

    private final Permutation permutation = new PermutationSolution();

    @Test
    void testPalindromeEmpty() {
        assertThat(permutation.findPermutation("")).containsExactly("");
    }

    @Test
    void testPalindromeNull() {
        assertThat(permutation.findPermutation(null)).hasSize(0);
    }

    @Test
    void testPalindromeOkOneChar() {
        assertThat(permutation.findPermutation("a")).containsExactly("a");
    }

    @Test
    void testPalindromeOkSameChars() {
        assertThat(permutation.findPermutation("aaaaaa")).containsExactly("aaaaaa");
    }

    @Test
    void testPalindromeClassic() {
        assertThat(permutation.findPermutation("abc")).containsExactlyInAnyOrder("abc", "acb", "bac", "bca", "cab", "cba");
    }

    @Test
    void testPalindromeLarge() {
        assertThat(permutation.findPermutation("abcdefghij")).hasSize(3628800);
    }
}