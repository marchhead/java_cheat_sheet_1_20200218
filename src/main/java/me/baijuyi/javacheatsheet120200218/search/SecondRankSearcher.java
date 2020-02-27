package me.baijuyi.javacheatsheet120200218.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Write a program to find the second largest number inside an array of int.
 */
public class SecondRankSearcher {
    public int getTheSecondLargestNumber(int[] arr) {
        if (arr == null || arr.length == 1) {
            throw new NoSecondRankException(arr);
        }
        int[] sortedWithNoDuplicates = Arrays.stream(arr).distinct().sorted().toArray();

        return sortedWithNoDuplicates[sortedWithNoDuplicates.length - 2];
    }
}
