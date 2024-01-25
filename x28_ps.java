import javax.management.MXBean;

class mythrea extends Thread{
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}
class mythrea2 extends Thread{
    public void run() {
//        while (true) {
            System.out.println("Welcome");
//            try {
//                Thread.sleep(200);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
            }
        }
public class x28_ps {
    public static void main(String[] args) {
        mythrea t1 = new mythrea();
//        t1.start();
        t1.setPriority(6);
        System.out.println(t1.getPriority());
        mythrea2 t2 = new mythrea2();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        t2.setPriority(5);
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState());

    }
}
