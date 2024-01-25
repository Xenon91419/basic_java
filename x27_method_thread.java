class mythre extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("hello");
            try {
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class mythre1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 60) {
            System.out.println("hello2");
            i++;
        }
    }
}
public class x27_method_thread {
    public static void main(String[] args) {
        mythre t1 = new mythre();
        mythre1 t2 = new mythre1();
        t1.start();
//        try {
//            t1.join();
//        }
//            catch(Exception e){
//                System.out.println(e);
//            }
        t2.start();
    }
}
