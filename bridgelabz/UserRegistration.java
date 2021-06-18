package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        String name = "Abc";
        System.out.println(ValidateFirstName(name));
    }

    private static boolean ValidateFirstName(String firstName){
        Pattern p = Pattern.compile("^[A-Z]+[a-zA-Z]{2}$");
        Matcher m = p.matcher(firstName);
        return m.matches();
    }
}
