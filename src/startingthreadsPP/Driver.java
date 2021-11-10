package startingthreadsPP;

public class Driver {
    public static void main(String[] args) {
        StringHolder myString = new StringHolder("As I expected. \"Mary Poppins, practically perfect in every way.\"");
        Thread runnableString = new Thread(new RunnableStringHolder("As I expected. \"Mary Poppins, practically perfect in every way.\""));
        myString.start();
        runnableString.start();
    }
}
