package me.baijuyi.javacheatsheet420200223.calculate.runnable;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;

public class WriteRunner implements Runnable {
    private OutputStream out;
    private BlockingQueue<String> queue;

    public WriteRunner(OutputStream out, BlockingQueue<String> queue) {
        this.out = out;
        this.queue = queue;
    }

    public void run() {
        while (ReadRunner.isReading) {
            while (queue.size() != 0) {
                String problem = queue.poll();
                String line = "";
                if ("".equals(problem)) {
                    line = "\n";
                } else {
                    JexlEngine jexlEngine = new JexlBuilder().create();
                    JexlExpression jexlExpression = jexlEngine.createExpression(problem);
                    Object evaluate = jexlExpression.evaluate(null);
                    line = problem + " = " + evaluate + "\n";
                }
                try {
                    out.write(line.getBytes());
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
