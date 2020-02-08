import java.util.Arrays;
import java.util.stream.Collectors;

public class TimeFormatterArraysStreamBtf {

  public static String formatDuration(int seconds) {
    return seconds == 0
        ? "now"
        : Arrays.stream(
                new String[] {
                  formatTime("year", (seconds / 31536000)),
                  formatTime("day", (seconds / 86400) % 365),
                  formatTime("hour", (seconds / 3600) % 24),
                  formatTime("minute", (seconds / 60) % 60),
                  formatTime("second", (seconds % 3600) % 60)
                })
            .filter(e -> e != "")
            .collect(Collectors.joining(", "))
            .replaceAll(", (?!.+,)", " and ");
  }

  private static String formatTime(String s, int time) {

    return time == 0 ? "" : Integer.toString(time) + " " + s + (time == 1 ? "" : "s");
  }
}
