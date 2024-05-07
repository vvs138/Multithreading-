import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadedApp {
    private static int sharedResource = 0;
    private static final int NUM_THREADS = 5;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        for (int i = 0; i < NUM_THREADS; i++) {
            Thread thread = new Thread(new Worker(lock));
            thread.start();
        }
    }

    static class Worker implements Runnable {
        private final Lock lock;

        public Worker(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                lock.lock();
                sharedResource++;
                System.out.println("Thread " + Thread.currentThread().getId() + " updated shared resource to: " + sharedResource);
            } finally {
                lock.unlock();
            }
        }
    }
}
