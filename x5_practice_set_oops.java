class cylinder{
    int radius;
    int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    public double srufaceArea(){
        return (2 * Math.PI * radius * height) + 2 * Math.PI * radius * radius;
    }
}
class rectangle1{
    int length;
    int breadth;
    public rectangle1(int length,int breadth){
        this.length = length;
        this. breadth = breadth;
    }
    public rectangle1(){
        this.length = 4;
        this. breadth = 5;
    }

    public int getBreadth() {
        return breadth;
    }
    public int getLength(){
        return length;
    }
}
public class x5_practice_set_oops {
    public static void main(String[] args) {
//        prob 1
        cylinder x = new cylinder(12,9);
        x.setRadius(9);
        x.setHeight(12);
        int h = x.getHeight();
        System.out.println("height : " +h);
        int r = x.getRadius();
        System.out.println("radius : " +r);
        //        prob 2
        System.out.println(x.srufaceArea());
        //        prob 3
        rectangle1 y = new rectangle1();
        //        prob 4
        System.out.println(y.getBreadth());
        System.out.println(y.getLength());
    }
}
