interface MyCamera{
    void takingSnap();
    void recordingVideo();
    void recordingIn4k();
    private void powerOn(){
        System.out.println("powering on...");
    }
    default void greet(){
        powerOn();
        System.out.println("Good Morning");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class myCellphone{
    void cellNumber(int Phonenumber){
        System.out.println("calling "+Phonenumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}
class mySmartPhone extends myCellphone implements Wifi, MyCamera{
    public void takingSnap(){
        System.out.println("takingSnap");
    }
    public void recordingVideo(){
        System.out.println("recording video");
    }
    public void recordingIn4k(){
        System.out.println("recording in 4k");
    }
    public String[]  getNetwork(){
        System.out.println("getting list of networks");
        String[] networkList = {"ziya","rashid","mayank"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+network);
    }
//    public void greet(){
//        System.out.println("Hello good morning brdr");
//    }
}
public class x16_default_methods {
    public static void main(String[] args) {
        mySmartPhone ziya = new mySmartPhone();
        ziya.greet();
        String[] ar = ziya.getNetwork();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
