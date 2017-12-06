package com.nrenaud.katas.string;

import java.util.Collection;

public interface Permutation {

    /**
     * Find every permutation of the input string. return
     * @param stringToPermute the input string to permute.
     * @return all existing permutation of the string.
     */
    Collection<String> findPermutation(String stringToPermute);
}