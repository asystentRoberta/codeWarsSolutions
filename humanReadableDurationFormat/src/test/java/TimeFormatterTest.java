import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {

  @Ignore
  @Test
  public void formatDuration() {
    assertEquals("1 second", TimeFormatter.formatDuration(1));
    assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    assertEquals("1 hour", TimeFormatter.formatDuration(3600));
    assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
  }

  @Test
  public void earlyTests(){
    System.out.println(TimeFormatter.formatDuration(33276497));
    System.out.println(TimeFormatter.formatDuration(1740497));
    System.out.println("============================================");
    System.out.println(TimeFormatter.formatDuration(1));
    System.out.println(TimeFormatter.formatDuration(62));
    System.out.println(TimeFormatter.formatDuration(120));
    System.out.println(TimeFormatter.formatDuration(3600));
    System.out.println(TimeFormatter.formatDuration(3662));
  }
}
