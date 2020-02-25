package me.baijuyi.javacheatsheet420200223.calculate.runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

public class ReadRunner implements Runnable {
    private InputStream in;
    private BlockingQueue<String> queue;
    public static boolean isReading = true;


    public ReadRunner(InputStream in, BlockingQueue<String> queue) {
        this.in = in;
        this.queue = queue;

    }

    public void run() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String problem = null;
            while ((problem = reader.readLine()) != null) {
                queue.offer(problem);
            }
            isReading = false;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
