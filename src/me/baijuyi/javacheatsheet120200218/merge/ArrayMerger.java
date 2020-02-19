
package me.baijuyi.javacheatsheet120200218.merge;
/**
 * Write a program to merge two array of int.
 */
public class ArrayMerger {
    public int[] merge(int[] left, int[] right) {
        if (left == null) {
            left = new int[0];
        }
        if (right == null) {
            right = new int[0];
        }
        int[] res = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            res[i] = left[i];
        }

        for (int i = 0; i < right.length; i++) {
            res[i + right.length] = right[i];
        }
        return res;
    }
}
