class thread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("thread 1 is running");
            System.out.println("chatting...");
            i++;
        }
    }
}
class thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("thread 2 is running");
            System.out.println("Cooking...");
            i++;
        }
    }
}
public class x23_threads {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
