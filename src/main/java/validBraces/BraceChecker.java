package validBraces;

public class BraceChecker {

    public boolean isValid(String braces) {



        final long parentheses = braces.chars()
                .filter(c -> c == ')' || c == '(')
                .count();
        final long brackets = braces.chars()
                .filter(c -> c == '[' || c == ']')
                .count();
        final long curlyBraces = braces.length() - brackets - parentheses;

        return (parentheses % 2 == 0 && brackets % 2 == 0 && curlyBraces % 2 == 0);
    }
}
