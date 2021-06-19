/**
 * ****************************************************************************
 * Purpose: This Class User Registration is implemented to ensure all validations
 * are in place during the User Entry
 *
 * @author Dhiraj
 * @version 1.0
 * @since 18-06-2021 **********************************************************
 */
package bridgelabz.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Main method is starting point os this program.
     * @param args
     */
    public static void main(String[] args) {
        //user inputs for validation
        String firstName = "Dhiraj";
        String lastName = "Sharma";
        String email = "abc.xyz@bl.co.in";
        String mNumber = "91 8988373573";
        String password = "A3@gfkdhs";

        // regex patterns for user inputs
        String fNameRegex = "^[A-Z]{1}+[a-z]{2,}$";
        String lNAmeRegex = "^[A-Z]{1}[a-z]{2,}$";
        String emailRegex = "^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$";
        String mobileRegex = "^[9][1]+\\s\\d{10}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*?[#?!@$%^&*-])[a-zA-Z0-9]{8,}$";

        System.out.println(validationChecker(passwordRegex,password));
    }

    /**
     * Method for validating the user's first name, last name, password, email, mobile number, using regex.
     * @param regex : regex for first name, last name, password, email or mobile number.
     * @param userInput :  first name, last name, password, email, mobile number.
     * @return
     */

    private static boolean validationChecker(String regex, String userInput){
        Pattern pattern = Pattern.compile(regex);
        if (userInput == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }
}
