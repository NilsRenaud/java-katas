package com.nrenaud.katas.array;

import com.nrenaud.katas.array.solution.MissingItemSolution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class TestMissingItem {

    private final MissingItem missingItem = new MissingItemSolution();

    @Test
    void testOneMissingItemNominal() {
        assertThat(missingItem.findOneMissingItem(createArrayWithMissingItem(100, 20))).isEqualTo(20);
        assertThat(missingItem.findOneMissingItem(createArrayWithMissingItem(100000, 354))).isEqualTo(354);
    }

    @Test
    void testOneMissingItemBoundaries() {
        assertThat(missingItem.findOneMissingItem(createArrayWithMissingItem(10, 1))).isEqualTo(1);
        assertThat(missingItem.findOneMissingItem(createArrayWithMissingItem(10, 10))).isEqualTo(10);
    }

    @Test
    void testOneMissingItemCornerCases() {
        assertThat(missingItem.findOneMissingItem(new int[0])).isEqualTo(0);
        assertThat(missingItem.findOneMissingItem(null)).isEqualTo(0);
    }

    @Test
    void testOneMissingItemInReallyBigArray() {
        //MAX_INT throw a java memory error. We need to launch the JVM with specifics settings to reach this limit.
        // But the sum of all elements through 100000000 is bigger than MAX_INT. This test should also be is enough.
        assertThat(missingItem.findOneMissingItem(createArrayWithMissingItem(100000000, 3023))).isEqualTo(3023);
    }

    @Test
    void testMissingItemsNominal() {
        assertThat(missingItem.findAnyNumberOfMissingItem(createArrayWithMissingItem(10, 2, 4))).containsExactly(2, 4);
    }

    @Test
    void testMissingItemsBoundary() {
        assertThat(missingItem.findAnyNumberOfMissingItem(createArrayWithMissingItem(10, 1, 9))).containsExactly(1, 9);
    }

    @Test
    void testMissingItemsReallyBigArray() {
        assertThat(missingItem.findAnyNumberOfMissingItem(createArrayWithMissingItem(100000000, 1, 9, 523, 9998, 45872216))).containsExactly(1, 9, 523, 9998, 45872216);
    }

    private static int[] createArrayWithMissingItem(int length, Integer... missingItems) {
        List<Integer> missingItemsList = Arrays.asList(missingItems);
        return IntStream.range(1, length+1)
                .filter(integer -> !missingItemsList.contains(integer))
                .toArray();

    }
}