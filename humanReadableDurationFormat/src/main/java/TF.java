public class TF {

  private static int S_PER_MIN = 60;
  private static int S_PER_HR = 60 * S_PER_MIN;
  private static int S_PER_DAY = 24 * S_PER_HR;
  private static int S_PER_YEAR = 365 * S_PER_DAY;

  private static String unit(int n, String kind) {
    return n == 0 ? "" : String.format("%d %s%s, ", n, kind, n == 1 ? "" : "s");
  }

  public static String formatDuration(int s){
      if(s==0) return "now";

      int y,d,h,m;

      s -= (y = s/S_PER_YEAR)* S_PER_YEAR;
      s -= (d = s / S_PER_DAY) * S_PER_DAY;
      s -= (h = s / S_PER_HR)  * S_PER_HR;
      s -= (m = s / S_PER_MIN) * S_PER_MIN;

      String ret = unit(y,"year") + unit(d,"day") + unit(h,"hour") + unit(m,"minute") + unit(s,"second");
      ret = ret.substring(0, ret.length()-2);
      return ret.lastIndexOf(",") == -1 ? ret : ret.replaceAll("(.+), (.+?)$", "$1 and $2");
  }
}
