public class practice_set_3 {
    public static void main(String[] args) {
        //question 1
        String name = "Ziya Khan";
        System.out.println(name.toLowerCase());

        //question 2
        String rname = "Ziya Khan";
        System.out.println(rname.replace(' ','_'));

        //question 3
        String letter = "Dear <|name|> Thanks a lot.";
//        letter = letter.replace("<|name|>","ziya");
//        System.out.println(letter);
        System.out.println(letter.replace("<|name|>","ziya"));

//        question 4
        String detect = "this stirng contains    double and triple spaces";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));

        //question 5
        String letter2 = "Dear Ziya, This Java Course is Nice.Thanks";
        System.out.println(letter2);
        System.out.println("Dear Ziya,\n\tThis Java Course is Nice.\n\tThanks.");

    }
}
