class circle{
    public int radius;
    circle(int r){
        this.radius = r;
    }
    public double area(){
        return this.radius * this.radius * Math.PI;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int h,int r){
        super(r);
        this.height = h;
    }
    public double volume(){
        return this.radius * this.radius * Math.PI * this.height;
    }

}
class rectangle2{
    public int length;
    public int breadth;
    rectangle2(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    public double area(){
        return this.length * this.breadth;
    }
}
class cuboid extends rectangle2{
    public int height;
    cuboid(int l,int h, int b){
        super(l,b);
        this.height = h;
    }
    public double area(){
        return (2*this.length*this.breadth) + (2*this.length*this.height) + (2*this.height*this.breadth);
    }
    public double volume(){
        return this.breadth*this.height*this.length;
    }
}
public class x13_ps {

    public static void main(String[] args) {
    //    prob 1
//    circle a = new circle(2);
//        System.out.println(a.area());
        cylinder1 b = new cylinder1(3,4);
        System.out.println(b.area());
//        prob 2
        rectangle2 r = new rectangle2(2,3);
        cuboid c = new cuboid(4,5,6);
}
}
