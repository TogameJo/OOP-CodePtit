package thread;

public class Main {
    public static void main(String[] args) {
        System.out.print("Thread 1: ");
        SoHoanHao a = new SoHoanHao();
        a.start();

        try {
            a.join();
        } catch (InterruptedException e) {
        }

        System.out.println();

        System.out.print("Thread 2: ");
        ChiaHet b = new ChiaHet();
        b.start();

        try {
            b.join();
        } catch (InterruptedException e) {
        }

        System.out.println();

        System.out.print("Thread 3: ");
        Songuyento c = new Songuyento();
        c.start();

        try {
            c.join();
        } catch (InterruptedException e) {
        }

    }
}
