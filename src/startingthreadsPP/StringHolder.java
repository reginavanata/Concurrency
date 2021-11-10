package startingthreadsPP;

public class StringHolder extends Thread {

    private String data;

    public StringHolder(String data) {
        // construct the thread with the name Thread
        super("Thread");
        data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Printed from " + Thread.currentThread().getName() + ": As I expected. Maryy poppins perfect in every way");
    }

    @Override
    public String toString() {
        return data;
    }


}
