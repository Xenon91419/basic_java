public class STRINGS {
    public static void main(String[] args) {
        String name = "Ziya";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nontrimmedstring = "     ziya     ";
        System.out.println(nontrimmedstring);

        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);

        String substring = trimmedstring.substring(2,3);
        System.out.println(substring);

        String Name = "ziya akhtar khan";
        System.out.println(Name.replace('z','a'));
        System.out.println(Name.replace("z","god"));

        System.out.println(Name.startsWith("ziya"));
        System.out.println(Name.endsWith("khan"));

        String xenon = "Xenon";
        System.out.println(xenon.charAt(0));

        System.out.println(xenon.indexOf("n"));
        System.out.println(xenon.indexOf("i"));

        System.out.println(xenon.indexOf('n',3));
        System.out.println(xenon.lastIndexOf('n',3));

        System.out.println(xenon.equals("ziya"));
        System.out.println(xenon.equalsIgnoreCase("xEnoN"));

        System.out.println("Hello I am Ziya \t I am 21 years old");
    }
}
