package examples;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread's name: " + this.getName());

        System.out.println("Thread's priority: " + this.getPriority());
    }

    // temporary tester
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // don't do this because you will
        //not have 2 threads - main and the t
        //thread object
        //t.run();
        t.start(); //invisible call to run

    }
}
