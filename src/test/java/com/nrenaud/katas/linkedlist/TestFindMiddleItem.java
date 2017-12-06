package com.nrenaud.katas.linkedlist;

import com.nrenaud.katas.linkedlist.solution.FindMiddleItemSolution;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

class TestFindMiddleItem {

    private final FindMiddleItem missingItem = new FindMiddleItemSolution();

    @Test
    void testFindMiddleItemNominal() {
        assertThat(missingItem.findMiddleItem(createLinkedListOf(1, 2, 3, 4))).isEqualTo(2);
        assertThat(missingItem.findMiddleItem(createLinkedListOf(1, 2, 3, 4, 5))).isEqualTo(3);

        assertThat(missingItem.findMiddleItem(createLinkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 ,17, 18, 19, 20))).isEqualTo(10);
    }

    @Test
    void testFindMiddleItemCornerCase() {
        assertThat(missingItem.findMiddleItem(createLinkedListOf(1))).isEqualTo(1);
        assertThat(missingItem.findMiddleItem(createLinkedListOf())).isNull();
        assertThat(missingItem.findMiddleItem(null)).isNull();
    }

    private LinkedList<Integer> createLinkedListOf(Integer... elements){
        LinkedList<Integer> ll = new LinkedList<>();
        for(Integer elem : elements){
            ll.add(elem);
        }

        return ll;
    }

}