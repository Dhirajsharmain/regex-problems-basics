package bridgelabz.Test;

import bridgelabz.services.UserRegistration;
import bridgelabz.services.ValidateEmails;
import org.junit.Before;

public class validateEmailsTest {
    ValidateEmails validateEmails;

    @Before
    public void setup() {
        validateEmails = new ValidateEmails();
    }
}
