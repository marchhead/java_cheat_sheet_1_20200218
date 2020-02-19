package me.baijuyi.javacheatsheet120200218.search;

public class SecondRankSearcherTest {
    public static void main(String[] args) {
        SecondRankSearcher srs = new SecondRankSearcher();
        int[] arr = new int[]{88, 77, 99, 101, 303, 303};
        int secondLargest = srs.getTheSecondLargestNumber(arr);
        System.out.println(secondLargest);
    }
}
