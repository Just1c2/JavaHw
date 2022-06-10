package trainning.lab11.threadsexit;

import org.w3c.dom.ls.LSOutput;

public class JavaMthreads extends Thread {
    int exit;
    String pos;
    String main;

    JavaMthreads(int exit, String pos, String main) {
        this.exit = exit;
        this.pos = pos;
        this.main = main;
    }

    public void run() {
        for (int i = exit; i > 0; i--) {
            System.out.println(pos + " : " + i);
            try{
                Thread.sleep(Math.round(Math.random()*5000));
            } catch (Exception e) {}
        }
        System.out.println(pos + " exiting");

    }

}
