import org.w3c.dom.ls.LSOutput;

class c1{
    public int a = 20;
    protected int b = 30;
    int c = 40;
    private int d = 50;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class x20_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d);
    }
}
