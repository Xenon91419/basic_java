class aclass{
    int a;
    public int geta(){
        return a;
    }
    aclass(int a){
    this.a = a;
    }
}
class bclass extends aclass{
    bclass(int c){
        super(c);
        System.out.println("i am bclass constructor");
    }
}
public class x8_super {
    public static void main(String[] args) {
        aclass a = new aclass(3);
        bclass b = new bclass(3);
        System.out.println(a.geta());
    }
}
