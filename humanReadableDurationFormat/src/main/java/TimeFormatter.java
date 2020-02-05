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


    if(timeInYears>1) solvedString.append(timeInYears).append(" years");
    if(timeInYears==1) solvedString.append(timeInYears).append(" year");

    if(solvedString.length()>0 && convertedInDays>0) solvedString.append(", ");
    if(convertedInDays>1) solvedString.append(convertedInDays).append(" days");
    if(convertedInDays==1) solvedString.append(convertedInDays).append(" day");

    if(solvedString.length()>0 && convertedInHours>0) solvedString.append(", ");
    if(convertedInHours>1) solvedString.append(convertedInHours).append(" hours");
    if(convertedInHours==1) solvedString.append(convertedInHours).append(" hour");

    if(solvedString.length()>0 && convertedInMinutes>0) solvedString.append(", ");
    if(convertedInMinutes>1) solvedString.append(convertedInMinutes).append(" minutes");
    if(convertedInMinutes==1) solvedString.append(convertedInMinutes).append(" minute");

    if(secondsToSolve>1) {
      if(solvedString.length()>0) solvedString.append(" and ");
      solvedString.append(secondsToSolve).append(" seconds");
    }
    if(secondsToSolve==1) {
      if(solvedString.length()>0) solvedString.append(" and ");
      solvedString.append(secondsToSolve).append(" second");
    }

    if (solvedString.toString().isEmpty()) return "now";
    return solvedString.toString();
  }
}
