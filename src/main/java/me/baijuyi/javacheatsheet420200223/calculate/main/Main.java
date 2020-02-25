package me.baijuyi.javacheatsheet420200223.calculate.main;

import me.baijuyi.javacheatsheet420200223.calculate.runnable.ReadRunner;
import me.baijuyi.javacheatsheet420200223.calculate.runnable.WriteRunner;

import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        InputStream in = Main.class.getResourceAsStream("input.txt");
        OutputStream out = new FileOutputStream(new File("out.txt"));
        Boolean isReading = true;
        BlockingQueue queue = new LinkedBlockingDeque();
        ReadRunner reader = new ReadRunner(in, queue);
        WriteRunner writer = new WriteRunner(out, queue);
        new Thread(reader).start();
        new Thread(writer).start();
    }

}