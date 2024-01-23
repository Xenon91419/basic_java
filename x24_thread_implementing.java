class threadrunnable1 implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("running..");
        }
    }
}
        class threadrunnable2 implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("eating...");
        }
    }
}
public class x24_thread_implementing {
    public static void main(String[] args) {
        threadrunnable1 bullet = new threadrunnable1();
        Thread gun1 = new Thread(bullet);
        threadrunnable2 bullet2 = new threadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
