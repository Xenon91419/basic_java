class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(int Myid,String Myname){
        id = Myid;
        name = Myname;
    }
    public MyMainEmployee(String Myname){
        name = Myname;
    }
     public void setName(String n){
        name = n;
    }
     public String getName(){
         return name;
     }
     public void setId(int i){
         id = i;
     }
     public int getId(){
         return id;
     }
}

public class x4_constructors {
    public static void main(String[] args) {
        MyMainEmployee ziya = new MyMainEmployee(34 , "ziya");
//        ziya.setId(43);
//        ziya.setName("Ziya akhtar khan");
        System.out.println(ziya.getId());
        System.out.println(ziya.getName());
    }
}
