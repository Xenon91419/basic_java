class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("hello?");
    }
}
public class x25_constructor_thread {
    public static void main(String[] args) {
        mythr t = new mythr("ziya");
        t.start();
        System.out.println("the thread t id is: " +t.threadId());
        System.out.println("the thread t name is: " +t.getName());
    }
}
