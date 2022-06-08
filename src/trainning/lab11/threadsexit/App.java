package trainning.lab11.threadsexit;

public class App {
    public static void main(String[] args) {
        JavaMthreads[] threads = new JavaMthreads[3];
        threads[0] = new JavaMthreads(5, "First", "main");
        threads[1] = new JavaMthreads(5, "Second", "main");
        threads[2] = new JavaMthreads(5, "Third", "main");

        for (int i = 0; i < 3; i++) {
            threads[i].start();
        }

    }
}
