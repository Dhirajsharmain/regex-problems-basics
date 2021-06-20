package bridgelabz.Test;

import bridgelabz.services.UserRegistration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

    UserRegistration userRegistration;

    @Before
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateName_shouldReturnTrue_whenFirstLatterIsCapital() {
        boolean result = userRegistration.validateName("Dhiraj");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameFirstLatterIsSmall() {
        boolean result = userRegistration.validateName("dhiraj");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnTrue_whenNameStartsWithCapAndHasMini3Characters() {
        boolean result = userRegistration.validateName("Dhi");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameStartsWithCapAndHasLessThan3Characters() {
        boolean result = userRegistration.validateName("Dh");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameIsNull() {
        boolean result = userRegistration.validateName(null);
        assertFalse(result);
    }

}
