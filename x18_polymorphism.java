interface camera{
    void recordVideo();
    void record4kVideo();
}
interface calling{
    void dialling();
    void pickCall();
}
class cellPhone implements calling{
    public void pickCall(){
        System.out.println("picking call...");
    }
    public void dialling(){
        System.out.println("dialling...");
    }
}
class smartphone2 extends cellPhone implements camera,calling{
    public void recordVideo(){
        System.out.println("recording...");
    }
    public void record4kVideo(){
        System.out.println("recording 4k video...");
    }
}
public class x18_polymorphism {
    public static void main(String[] args) {
        camera c = new smartphone2();
        c.record4kVideo();
        calling ca = new smartphone2();
        ca.dialling();
//        ca.recordVideo(); -- > wrong
    }
}
