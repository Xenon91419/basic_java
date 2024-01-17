class a{
        public int harry() {
            return 4;
        }
        public void meth2(){
            System.out.println("i am method 2 of class a");
        }
}
class b extends a{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class b");
    }
    public void meth3(){
        System.out.println("i am method 3 of class b");
    }
}
public class x9_method_overriding {
    public static void main(String[] args) {
        a a = new a();
        a.meth2();
        b b = new b();
        b.meth2();
    }
}
