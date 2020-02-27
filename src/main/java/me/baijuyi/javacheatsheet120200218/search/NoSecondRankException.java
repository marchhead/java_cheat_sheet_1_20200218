package me.baijuyi.javacheatsheet120200218.search;

import java.util.Arrays;

public class NoSecondRankException extends RuntimeException {
    public NoSecondRankException(int[] arr) {
        super("No second largest number in the array " + Arrays.toString(arr));
    }
}
