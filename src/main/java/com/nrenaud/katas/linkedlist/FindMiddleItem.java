package com.nrenaud.katas.linkedlist;

import java.util.LinkedList;

public interface FindMiddleItem {

    /**
     * Find the element in the middle of the linked list.
     * Example : 1 -> 2 -> 3 -> X       => 2
     *           1 -> 2 -> 3 -> 4 -> X  => 2
     *           1 -> X                 => 1
     *           -> X                   => null
     *           null                   null.
     *
     * @param linkedList The linked list to scan in order to find the middle element.
     * @return The item in the middle of the linked list. Or null if the list is empty or null.
     */
    Integer findMiddleItem(LinkedList<Integer> linkedList);
}