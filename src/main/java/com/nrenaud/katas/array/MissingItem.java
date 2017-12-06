package com.nrenaud.katas.array;

public interface MissingItem {

    /**
     * Find the only one missing item in an array of size X-1 containing every numbers from 1 to X but one.
     * Example : [1, 2, 3, 4, 5, 7, 8, 9, 10] should return 6
     *
     * @param arrayWithOneMissingItem the array to scan containing ONLY ONE missing item.
     * @return The only missing item. 0 when no item is missing.
     */
    int findOneMissingItem(int[] arrayWithOneMissingItem);

    /**
     * Find any missing items in an array containing every numbers from 1 to X but one.
     * Example : [1, 2, 3, 4, 5, 7, 9, 10] should return [6, 8]
     *
     * @param arrayWithMissingItems the array to scan containing multiple missing items.
     * @return an array containing every missing items. [] when no item is missing
     */
    int[] findAnyNumberOfMissingItem(int[] arrayWithMissingItems);
}