import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {

  @Test
  public void formatDuration() {
    assertEquals("1 second", TimeFormatter.formatDuration(1));
    assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    assertEquals("1 hour", TimeFormatter.formatDuration(3600));
    assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    assertEquals("5 days, 21 hours and 29 minutes",TimeFormatter.formatDuration(509340));
    assertEquals("now", TimeFormatter.formatDuration(0));
  }

  @Test
  public void earlyTests(){
    System.out.println("Na tym sie wylozyl:");
    System.out.println(TimeFormatter.formatDuration(509340));
    System.out.println(TimeFormatter.formatDuration(33276497));
    System.out.println(TimeFormatter.formatDuration(1740497));
    System.out.println("============================================");
    System.out.println(TimeFormatter.formatDuration(1));
    System.out.println(TimeFormatter.formatDuration(62));
    System.out.println(TimeFormatter.formatDuration(120));
    System.out.println(TimeFormatter.formatDuration(3600));
    System.out.println(TimeFormatter.formatDuration(3662));
    System.out.println(TimeFormatter.formatDuration(3602));
    System.out.println(TimeFormatter.formatDuration(63072001));
    System.out.println(TimeFormatter.formatDuration(63075701));
    System.out.println(TimeFormatter.formatDuration(68331701));
    System.out.println(TimeFormatter.formatDuration(65703201));
    System.out.println(TimeFormatter.formatDuration(68346401));

  }
}
