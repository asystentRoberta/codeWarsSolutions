import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {

    public static String songDecoder(String song) {

/*        song = song.replace("WUB", " ");
        song = song.trim().replaceAll("(\\s)+", " ");*/

//Same but better:
        return song.replaceAll("(WUB)+", " ").trim();
    }

    public static String songDecodeAnotherSolution(String song) {

        return Arrays
                .stream(song.split("WUB"))
                .filter(i -> !"".equals(i))
                .collect(Collectors.joining(" "));
    }

    public static String songDecodeCleanWithComment(String song){
        // error handle
        if (song.length() > 200 || song.isEmpty()) {
            return "";
        }

        // is it possible to do this with regular expressions too?

        // anyways... start to walk the string as a char array, we are going to try for < O(n) time
        char[] songCharArr = song.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        boolean buildingWord = false; // helps figure out to put a single space between words

        int i = 0;
        while (i < song.length())  {

            // stop checking before our 'lookahead' goes out of bounds
            // ex. WUB has a length of 3 so this is fine too look for WUB
            //     ^ + 2 = B
            // but WUB would go out of bounds
            //      ^ + 2 = out of bounds, hence minus 2 from the length
            if ((i < song.length()-2) && songCharArr[i] == 'W' && songCharArr[i+1] == 'U' && songCharArr[i+2] == 'B'){

                if (buildingWord){
                    strBuilder.append(" ");
                    buildingWord = false;
                }

                i += 3;

            } else {
                strBuilder.append(songCharArr[i]);
                buildingWord = true;
                i += 1;
            }
        }

        return strBuilder.toString().trim();
    }
}
