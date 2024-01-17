import java.security.spec.RSAOtherPrimeInfo;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refill...");
    }
    void changingTheNib(){
        System.out.println("Changing the nib...");
    }
}
class monkey{
    void jump(){
        System.out.println("Jump...");
    }
    void bite(){
        System.out.println("Bite...");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
abstract class telephone{
    abstract void ring();
    abstract void lift();
}
class smartPhone extends telephone{
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifitng...");
    }
    void camera(){
        System.out.println("Photos...");
    }
}
interface tvRemote{
    void powerON();
    void powerOFF();
}
interface smartTVRemote extends tvRemote{
    void netflix();
    void youtube();
}
class TV implements tvRemote{
    public void powerON(){
        System.out.println("ON");
    }
    public void powerOFF(){
        System.out.println("OFF");
    }
}
public class x19_ps {
    public static void main(String[] args) {
        fountainPen f1 = new fountainPen();
        f1.refill();
        human h = new human();
        h.sleep();
        monkey m1 = new human();
//        m1.speak - error cz monkey cant speak POLYMORPHISM
        m1.bite();
        basicAnimal b = new human();
        b.eat();
        telephone bsnl = new smartPhone();
        bsnl.lift();
        TV samsung = new TV();
        samsung.powerON();
    }
}
