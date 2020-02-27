package me.baijuyi.javacheatsheet320200219.lab;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println("try : try-finally can exist without catch.");
        }
        finally {
            System.out.println("finally : try-finally can exist without catch.");
        }
    }
}
