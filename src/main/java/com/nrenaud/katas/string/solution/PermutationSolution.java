package com.nrenaud.katas.string.solution;

import com.nrenaud.katas.string.Permutation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public final class PermutationSolution implements Permutation{

    /**
     * Find every permutation of the input string. return
     *
     * @param stringToPermute the input string to permute.
     * @return all existing permutation of the string.
     */
    public Collection<String> findPermutation(String stringToPermute) {
        Set<String> returnSet = new HashSet<>();
        Stack<StackElement> stack = new Stack<>();
        if (stringToPermute != null) {
            stack.push(new StackElement("", new StringBuilder(stringToPermute)));
        }

        while (!stack.isEmpty()) {
            StackElement element = stack.pop();
            if (element.remainder.length() == 0) {
                returnSet.add(element.base + element.remainder);
            } else {
                for (int i = 0; i < element.remainder.length(); i++) {
                    stack.push(new StackElement(element.base + element.remainder.charAt(i), new StringBuilder(element.remainder).deleteCharAt(i)));
                }
            }
        }

        return returnSet;
    }

    private class StackElement {
        private final String base;
        private final StringBuilder remainder;

        StackElement(String base, StringBuilder remainder) {
            this.base = base;
            this.remainder = remainder;
        }
    }
}