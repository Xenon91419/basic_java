public class grade_encrypt_decrypt {
    public static void main(String[] args) {
        char grade = 'B';
        grade  = (char)(grade + 9);
        System.out.println(grade);

//        decrypting
        grade = (char)(grade - 9 );
        System.out.println(grade);
    }
}
