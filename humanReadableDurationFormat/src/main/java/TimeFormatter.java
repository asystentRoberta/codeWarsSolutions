import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TimeFormatter {

  TimeFormatter() {}

  public static String formatDuration(int seconds) {

    final TimeUnit secs = TimeUnit.SECONDS;
    StringBuilder solvedString = new StringBuilder();
    long secondsToSolve = seconds;

    long timeInYears = 0;
    TimeUnit timeInDays = TimeUnit.DAYS;
    TimeUnit timeInHours = TimeUnit.HOURS;
    TimeUnit timeInMinutes = TimeUnit.MINUTES;

    long convertedInDays = timeInDays.convert(secondsToSolve, secs);

    if (convertedInDays > 365) {
      timeInYears = convertedInDays / 365;
      secondsToSolve = secondsToSolve - timeInYears * 31536000;
      convertedInDays = convertedInDays - timeInYears * 365;
    }

    if (convertedInDays > 0) {
      secondsToSolve = secondsToSolve - convertedInDays * 86400;
    }

    final long convertedInHours = timeInHours.convert(secondsToSolve, secs);
    if (convertedInHours > 0) {
      secondsToSolve = secondsToSolve - convertedInHours * 3600;
    }

    final long convertedInMinutes = timeInMinutes.convert(secondsToSolve, secs);
    if (convertedInMinutes > 0) {
      secondsToSolve = secondsToSolve - convertedInMinutes * 60;
    }
    solvedString
        .append(timeInYears)
        .append(" years, ")
        .append(convertedInDays)
        .append(" days, ")
        .append(convertedInHours)
        .append(" hours, ")
        .append(convertedInMinutes)
        .append(" minutes, ")
        .append(secondsToSolve)
        .append(" secunds. ");
    return solvedString.toString();
  }
}
