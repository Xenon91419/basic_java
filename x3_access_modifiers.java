class Employee2{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



public class x3_access_modifiers {

    public static void main(String[] args) {
        Employee2 ziya = new Employee2();
        ziya.setId(2);
        ziya.setName("Ziya akhtar khan");
        System.out.println(ziya.getId());
        System.out.println(ziya.getName());

    }
}
