class animals{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("number of animals");
        this.x = x;
    }
}
class dog extends animals{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("number of dogs");
        this.y = y;
    }
}
public class x6_inheritence {
    public static void main(String[] args) {
        dog d = new dog();
        d.setY(4);
        System.out.println(d.getY());
    }
}
