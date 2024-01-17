 class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
    }
    class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callingFriend() {
        System.out.println("Calling Mayank...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}
class tommyVercetti{
    public void running(){
        System.out.println("running...");
    }
    public void firing(){
        System.out.println("firing...");
    }
}

 public class x2_practice_set_oops {
    public static void main(String[] args) {
        /*
        prob 1
        Employee ziya = new Employee();
        ziya.salary = 45;
        ziya.setName("ziyaKhan");
        System.out.println(ziya.getName());
        System.out.println(ziya.getSalary());

        prob 2
        cellphone redmi = new cellphone();
        redmi.ringing();
        redmi.vibrating();
        redmi.callingFriend();
        prob 3
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

//      prob 4
        rectangle rc = new rectangle();
        rc.length = 3;
        rc.breadth = 4;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
         */
//        prob 5
        tommyVercetti player1 = new tommyVercetti();
        player1.running();
        player1.firing();
    }
}
