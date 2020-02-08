import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TFTest {
  @Test
  public void formatDuration() {
    assertEquals("1 second", TF.formatDuration(1));
    assertEquals("1 minute and 2 seconds", TF.formatDuration(62));
    assertEquals("2 minutes", TF.formatDuration(120));
    assertEquals("1 hour", TF.formatDuration(3600));
    assertEquals(
        "1 hour, 1 minute and 2 seconds", TF.formatDuration(3662));
    assertEquals(
        "5 days, 21 hours and 29 minutes", TF.formatDuration(509340));
    assertEquals("now", TF.formatDuration(0));
  }

  @Test
  public void earlyTests() {
    System.out.println("Na tym sie wylozyl:");
    System.out.println(TF.formatDuration(509340));
    System.out.println(TF.formatDuration(33276497));
    System.out.println(TF.formatDuration(1740497));
    System.out.println("============================================");
    System.out.println(TF.formatDuration(1));
    System.out.println(TF.formatDuration(62));
    System.out.println(TF.formatDuration(120));
    System.out.println(TF.formatDuration(3600));
    System.out.println(TF.formatDuration(3662));
    System.out.println(TF.formatDuration(3602));
    System.out.println(TF.formatDuration(63072001));
    System.out.println(TF.formatDuration(63075701));
    System.out.println(TF.formatDuration(68331701));
    System.out.println(TF.formatDuration(65703201));
    System.out.println(TF.formatDuration(68346401));
  }
}
