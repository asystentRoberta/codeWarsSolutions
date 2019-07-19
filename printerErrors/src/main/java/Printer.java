import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

    public static String printerError(String s) {

        Pattern pattern = Pattern.compile("[n-z]");
        Matcher matcher = pattern.matcher(s);

        return getCounterOfErrors(matcher)
                + "/"
                + s.length();
    }

    private static int getCounterOfErrors(Matcher matcher) {

        int counterOfErrors = 0;
        while (matcher.find()) {
            counterOfErrors++;
        }
        return counterOfErrors;
    }
}
