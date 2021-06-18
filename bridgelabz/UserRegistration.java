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
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        String email = "abc.xyz@bl.co.in";
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
        System.out.println(validateEmail(email));
    }

    /**
     * Method for validating the user first name using regex.
     * @param firstName : user's first name
     * @return
     */
    private static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /**
     * Method for validating the user last name using regex.
     * @param lastName : user's last name
     * @return
     */
    private static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /**
     * Method for validating the user's email using regex
     * @param email : user's email
     * @return
     */
    private static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
