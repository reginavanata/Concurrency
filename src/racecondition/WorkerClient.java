package racecondition;

public class WorkerClient {
    public static void main(String[] args) throws InterruptedException{
        //construct a WorkerThread that is in New state
        WorkerThread worker = new WorkerThread();
        Thread t = new Thread(worker);

        //make the thread runnable
        t.start();

        //main method goes to sleep for one second
        //main thread is in a timed waiting state
        //Thread.sleep(20);

        //use join method so main waits until
        //worker t thread is finished
        t.join(); //main thread is in waiting state

        //main thread print out the sum
        System.out.println(worker.getSum());
    }
}
