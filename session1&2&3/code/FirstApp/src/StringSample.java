import java.util.Locale;

public class StringSample {


    public static void main(String[] args) {
        String name="StriUUUUUng";

        System.out.println(name.length());

        String replace=name.replace("t","*");
        System.out.println(replace);
       String l= name.toLowerCase();
        System.out.println(l);
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("U",""));


    }
}
