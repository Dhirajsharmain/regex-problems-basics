/**
 * ****************************************************************************
 * Purpose: This Class User Registration is implemented to ensure all validations
 * are in place during the User Entry
 *
 * @author Dhiraj
 * @version 1.0
 * @since 18-06-2021 **********************************************************
 */
package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Main method is starting point os this program.
     * @param args
     */
    public static void main(String[] args) {
        String name = "Abc";
        System.out.println(ValidateFirstName(name));
    }

    /**
     * Method for validating the user first name using regex.
     * @param firstName
     * @return
     */
    private static boolean ValidateFirstName(String firstName){
        Pattern p = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");
        Matcher m = p.matcher(firstName);
        return m.matches();
    }


}
