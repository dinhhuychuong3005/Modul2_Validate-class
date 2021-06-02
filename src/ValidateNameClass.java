import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
