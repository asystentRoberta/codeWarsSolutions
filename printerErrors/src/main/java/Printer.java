import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

    public static String printerError(String s) {

        int lengthOfString = s.length();

        String regex = "[n-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        int counterOfErrors = 0;
        while (matcher.find()) {
            counterOfErrors++;
        }

        return counterOfErrors
                + "/"
                + lengthOfString;
    }
}
