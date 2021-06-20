/**
 * ****************************************************************************
 * Purpose: This Class is implemented to Sample Emails to Test
 *
 * @author Dhiraj
 * @version 1.0
 * @since 18-06-2021 **********************************************************
 */
package bridgelabz.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmails {

    /**
     * Method to ensure all the sample emails are valid, using regex.
     *
     * @param email : sample emails
     * @return : True or False
     */
    public static boolean validateEmails(String email) {
        String regex = "^^[a-zA-z0-9.+-]+[@]+[a-zA-z0-9]+[.]+[a-zA-z0-9.]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateEmails("abc@yahoo.com"));
    }
}
