class base{
    base(){
        System.out.println("i am a constructor");
    }
    base(int x){
        System.out.println("i am a constructor with value of x is : " + x);
    }
}
class derived extends base {
    derived() {
//        super(0);
        System.out.println("i am derived class constructor");
    }

    derived(int x, int y) {
        super(x);
        System.out.println("i am a derived class with a value of y is :" + y);
    }
}
    class child extends derived {
        child() {
            System.out.println("i am child constructor");
        }

        child(int x, int y, int z) {
            super(x, y);
            System.out.println("i am child class with a value of z is : " + z);
        }
    }
public class x7_constructor_in_inheritence {
    public static void main(String[] args) {
//        base b = new base();
//        derived d = new derived(3,5);
        child c = new child(3,4,5);
    }
}
