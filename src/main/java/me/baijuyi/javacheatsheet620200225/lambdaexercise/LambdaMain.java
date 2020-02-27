package me.baijuyi.javacheatsheet620200225.lambdaexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        testSearch();
        testGetString();
        testAverage();
        testUppercase();

    }

    public static void testSearch() {
        LambdaExercise le = new LambdaExercise();
        Person p1 = new Person("aom", 33, 'M');
        Person p2 = new Person("Tom", 33, 'M');
        Person p3 = new Person("Tom", 33, 'M');
        System.out.println(le.search(Arrays.asList(p1, p2, p3)));
    }

    public static void testGetString(){
        LambdaExercise le = new LambdaExercise();
        System.out.println(le.getString(Arrays.asList(1, 3, 4)));
    }

    public static void testAverage() {
        LambdaExercise le = new LambdaExercise();
        System.out.println(le.average(Arrays.asList(1, 3, 4)));
    }

    public static void testUppercase(){
        LambdaExercise le = new LambdaExercise();
        System.out.println(le.upperCase(Arrays.asList("kobe", "bryant", "forever")));
    }
}
