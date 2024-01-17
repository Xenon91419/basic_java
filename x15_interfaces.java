interface bicycle {
    void applyBrake(int decrement);
    void speedUP(int increment);
}
interface blowHorn {
    void a();
    void b();
}
class avonCycle implements bicycle, blowHorn{
    public void a(){
        System.out.println("lalalala");
    }
    public void b(){
        System.out.println("okokokok");
    }
    void blowHorn(){
        System.out.println("Blow Horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUP(int incerment){
        System.out.println("Appplying speedUP");
    }
}
public class x15_interfaces {
    public static void main(String[] args) {
        avonCycle a = new avonCycle();
        a.applyBrake(34);
        a.blowHorn();
        a.speedUP(23);
        a.a();
    }
}
