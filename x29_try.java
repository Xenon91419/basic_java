public class x29_try {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        try{
            int c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: " +e);
        }
        System.out.println("End of the code.");
    }
}
