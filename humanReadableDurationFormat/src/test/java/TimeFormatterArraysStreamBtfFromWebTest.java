import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeFormatterArraysStreamBtfFromWebTest {

  @Test
  public void formatDuration() {
    assertEquals("1 second", TimeFormatterArraysStreamBtf.formatDuration(1));
    assertEquals("1 minute and 2 seconds", TimeFormatterArraysStreamBtf.formatDuration(62));
    assertEquals("2 minutes", TimeFormatterArraysStreamBtf.formatDuration(120));
    assertEquals("1 hour", TimeFormatterArraysStreamBtf.formatDuration(3600));
    assertEquals(
        "1 hour, 1 minute and 2 seconds", TimeFormatterArraysStreamBtf.formatDuration(3662));
    assertEquals(
        "5 days, 21 hours and 29 minutes", TimeFormatterArraysStreamBtf.formatDuration(509340));
    assertEquals("now", TimeFormatterArraysStreamBtf.formatDuration(0));
  }

  @Test
  public void earlyTests() {
    System.out.println("Na tym sie wylozyl:");
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(509340));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(33276497));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(1740497));
    System.out.println("============================================");
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(1));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(62));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(120));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(3600));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(3662));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(3602));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(63072001));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(63075701));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(68331701));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(65703201));
    System.out.println(TimeFormatterArraysStreamBtf.formatDuration(68346401));
  }
}
