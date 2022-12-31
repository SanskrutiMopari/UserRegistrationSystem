import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    final String NAME_PATTERN = "[A-Z][a-z]{2,}";
    final String EMAIL_PATTERN = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    final String MOBILE_NUMBER_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}$";

    public boolean validateFirstName(String firstName) {
        return patternCheck(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) {
        return patternCheck(lastName, NAME_PATTERN);
    }

    public boolean validateEmaiId(String emailId) {
        return patternCheck(emailId, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return patternCheck(mobileNumber, MOBILE_NUMBER_PATTERN);
    }

    public boolean patternCheck(String input, String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
