package com.nrenaud.katas.array.solution;

import com.nrenaud.katas.array.MissingItem;

import java.util.BitSet;

public final class MissingItemSolution implements MissingItem {

    public int findOneMissingItem(int[] arrayWithOneMissingItem) {
        if (arrayWithOneMissingItem == null || arrayWithOneMissingItem.length < 1) {
            return 0;
        }
        long originalSize = arrayWithOneMissingItem.length + 1;
        long sum = 0;
        for (int item : arrayWithOneMissingItem) {
            sum += item;
        }

        return (int) ((originalSize * (originalSize + 1) / 2) - sum);
    }

    public int[] findAnyNumberOfMissingItem(int[] arrayWithMissingItems) {
        BitSet bitSet = new BitSet();
        int numberOfMissingItems = arrayWithMissingItems[arrayWithMissingItems.length - 1] - arrayWithMissingItems.length;
        int[] res = new int[numberOfMissingItems];

        for (int item : arrayWithMissingItems) {
            bitSet.set(item);
        }

        int clearBitIndex = 0;
        for (int i = 0; i < numberOfMissingItems; i++) {
            clearBitIndex = bitSet.nextClearBit(clearBitIndex + 1);
            res[i] = clearBitIndex;
        }

        return res;
    }
}