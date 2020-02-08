public class AppForProfiler {

  public static void main(String[] args) {

    Thread thread =
        new Thread(
            () -> {
              System.out.println("My app");
              System.out.println(TimeFormatter.formatDuration(1000000));
            });

    Thread thread1 =
        new Thread(
            () -> {
              System.out.println("App from web");
              System.out.println(TF_RegexKings.formatDuration(1000000));
            });

    while (true) {
      thread.run();
      thread1.run();
    }
  }
}
