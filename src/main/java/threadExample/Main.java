package threadExample;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

//        thread1.setDaemon(true);
//        thread2.setDaemon(true);

        thread1.start();
//        thread1.join(); // waits until Thread finished and go to main again
        thread2.start();

        System.out.println(10 / 0);
    }
}
