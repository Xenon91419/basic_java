class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("hello? " +getName());
            i++;
        }
    }
}
public class x26_priorities_thread {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("Ziya");
        mythr1 t2 = new mythr1("Ziya2");
        mythr1 t3 = new mythr1("Ziya3");
        mythr1 t4 = new mythr1("Ziya4");
        mythr1 t5 = new mythr1("Ziya5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
