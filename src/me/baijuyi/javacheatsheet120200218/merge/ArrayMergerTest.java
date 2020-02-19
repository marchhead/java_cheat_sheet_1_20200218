package me.baijuyi.javacheatsheet120200218.merge;

import java.util.Arrays;

public class ArrayMergerTest {
    public static void main(String[] args) {
        ArrayMerger merger = new ArrayMerger();
        int[] left = new int[]{1, 3, 5};
        int[] right = new int[]{2, 4, 6};
        int[] mergedArray = merger.merge(left,right);
        System.out.println(Arrays.toString(mergedArray));
    }
}
