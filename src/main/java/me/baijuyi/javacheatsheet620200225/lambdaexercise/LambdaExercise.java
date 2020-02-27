package me.baijuyi.javacheatsheet620200225.lambdaexercise;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaExercise {
    public List<String> search(List<Person> list) {

        return list.stream()
                .filter(p -> p.getName().startsWith("a") && p.getName().length() == 3)
                .map(p -> p.getName()).collect(Collectors.toList());
    }

    public String getString(List<Integer> list) {
        return list.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(","));
    }

    public Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average().getAsDouble();
    }

    public List<String> upperCase(List<String> list) {
        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

    }


}

class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
