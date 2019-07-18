public class Dubstep {

    public static String songDecoder(String song) {

        song = song.replace("WUB", " ");
        song = song.trim().replaceAll("(\\s)+", " ");

        return song;
    }
}
