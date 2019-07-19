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

    // :) Clever
    public static String printerErrorVeryShort(String s){
        return s.replaceAll("[a-m]","").length() + "/" + s.length();
    }

    public static String printerErrorWithStream(String s){
        long errs = s.chars()
                .filter(ch -> ch >'m')
                .count();
        return errs + "/" + s.length();
    }

    public static String printerErrorWithStreamAnotherOne(String s){
        int errors = (int) s.chars()
                .mapToObj(str->String.valueOf((char) str))
                .filter(str-> str.matches("[n-z]"))
                .count();
        return errors + "/" + s.length();
    }
}
