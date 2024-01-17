class phone{
    public void on(){
        System.out.println("turning on the phone...");
    }
    public void time(){
        System.out.println("time is 8 am");
    }
}
class smartphone extends phone{
    @Override
    public void on(){
        System.out.println("turning on the smartphone...");
    }
    public void music(){
        System.out.println("playing music");
    }
}
public class x10_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.on();
        obj.time();
//        obj.music();
        phone obj1 = new phone();
        obj.on();
        smartphone obj2 = new smartphone();
        obj2.music();
    }
}
