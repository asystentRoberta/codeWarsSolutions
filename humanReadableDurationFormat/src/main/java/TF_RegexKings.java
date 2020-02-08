public class TF_RegexKings {

    public static String formatDuration(int seconds) {
    String res = "";
    int[] units = new int[] {31536000, 86400, 3600, 60, 1};
    String[] labels = new String[] {"year", "day", "hour", "minute", "second"};

    if (seconds == 0) return "now";

    for (int i = 0; i < 5; i++) {
      if (seconds >= units[i]) {
        int q = seconds / units[i];
        seconds = seconds % units[i];
        res +=
            (res.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                + q
                + " "
                + labels[i]
                + (q > 1 ? "s" : "");
      }
    }
    return res;
  }
}
