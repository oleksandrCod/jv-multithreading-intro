package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnableInfinite = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnableInfinite);
        myRunnableThread.start();

        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
    }
}
