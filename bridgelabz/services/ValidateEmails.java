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
     * @param email : sample emails
     * @return
     */
    private static boolean validateEmails(String regex, String email){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateEmails("^[a-zA-z0-9.+-]+[@]+[a-zA-z0-9]+[.]+[a-zA-z0-9.]{2,}$","abc@yahoo.com"));
    }
}
