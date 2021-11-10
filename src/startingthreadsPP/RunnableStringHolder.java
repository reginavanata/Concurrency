package startingthreadsPP;

public class RunnableStringHolder implements Runnable {
    private String data;

    public RunnableStringHolder(String data) {
        this.data = data;
    }

    public String getData() {
        int digits = 0;
        int alphas = 0;
        System.out.println("Printed from " +Thread.currentThread().getName()+ ": As I expected. " + this.toString());
        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i))){
                digits++;
            } else if (Character.isAlphabetic(data.charAt(i))){
                alphas++;
            }
            
        }
        return data + "\nString length: " + data.length();
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println(this.getData());
    }

    @Override
    public String toString() {
        return getData();
    }
}
