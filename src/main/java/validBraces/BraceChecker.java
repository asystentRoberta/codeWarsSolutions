package validBraces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BraceChecker {

    public boolean isValid(String braces) {

        final String patternForBraces = "\\{\\}|\\[]|\\(\\)";

        Pattern patternBrackets = Pattern.compile(patternForBraces);
        Matcher matcher = patternBrackets.matcher(braces);

        while (matcher.find()) {
            braces = matcher.replaceAll("");
            matcher = patternBrackets.matcher(braces);
        }
        return (braces.length() == 0);
    }
}
