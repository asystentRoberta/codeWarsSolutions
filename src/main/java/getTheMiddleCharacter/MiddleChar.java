package getTheMiddleCharacter;

public class MiddleChar {

    public static String getMiddle(String word) {

        int mid = (int) Math.ceil((double) word.length() / 2) - 1;
        return word.substring(mid, word.length() - mid);
    }
}
