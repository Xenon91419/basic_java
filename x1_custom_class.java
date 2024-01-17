class Employee1{
       int id;
       String name;
       int salary;
       public void printDetails(){
           System.out.println("my id is " + id);
           System.out.println("my name is " + name);
       }
       public int getSalary(){
           System.out.println("my salary is " +salary);
           return salary;
       }
    }
    public class x1_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee1 ziya = new Employee1();
        Employee1 john = new Employee1();
        ziya.id = 12;
        ziya.name = "Ziya Akhtar Khan";
        ziya.salary= 30;
        john.id = 420;
        john.name = "Johny Sins";
        john.salary = 34;
//        System.out.println(ziya.id);
//        System.out.println(ziya.name);
        ziya.printDetails();
        john.printDetails();
        john.getSalary();
//        int salary = john.getSalary();
//        System.out.println(salary);
    }
}
