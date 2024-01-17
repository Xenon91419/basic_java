import org.w3c.dom.ls.LSOutput;

abstract class shape{
    abstract public void circle();
    abstract public void rectangle();
    abstract public void square();
}
class shapes extends shape{
    @Override
    public void circle() {
        System.out.println("i am a circle");
    }
        public void rectangle() {
            System.out.println("i am a rectangle");
        }
        public void square(){
        System.out.println("i am a square");

    }
}
abstract class shape2 extends shape{
    public void th(){
        System.out.println("hi");
    }
}
public class x14_abstract_method {
    public static void main(String[] args) {
        shape s = new shapes();
    }

}
