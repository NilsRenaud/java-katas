package com.nrenaud.katas.linkedlist.solution;

import com.nrenaud.katas.linkedlist.FindMiddleItem;

import java.util.Iterator;
import java.util.LinkedList;

public final class FindMiddleItemSolution implements FindMiddleItem {

    public Integer findMiddleItem(LinkedList<Integer> linkedList){
        if(linkedList == null || linkedList.isEmpty()){
            return null;
        }

        Iterator<Integer> stepByStepIterator = linkedList.iterator();
        Iterator<Integer> doubleStepIterator = linkedList.iterator();
        Integer middleItem = null;

        while(doubleStepIterator.hasNext()){
            doubleStepIterator.next();
            middleItem = stepByStepIterator.next();
            if(doubleStepIterator.hasNext()){
                doubleStepIterator.next();
            }
        }

        return middleItem;
    }
}