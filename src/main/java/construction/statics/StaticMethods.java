package construction.statics;

public class StaticMethods {

    public static void parseEmail(final String email){
        System.out.println(email.split("@")[0]);
    }
}
