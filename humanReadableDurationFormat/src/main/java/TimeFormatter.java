import java.util.Arrays;

public class TimeFormatter {

  TimeFormatter() {}

  public static String formatDuration(int seconds) {

    Integer[] solveInt = {
      seconds % 60,
      (seconds / 60) % 60,
      (seconds / (60 * 60)) % 24,
      (seconds / (60 * 60 * 24)) % 365,
      (seconds / (60 * 60 * 24 * 365))
    };
    String[] solveUnits = {"second", "minute", "hour", "day", "year"};
    int howManyNumbersLeft = (int) (5 - Arrays.stream(solveInt).filter(el -> el == 0).count());
    StringBuilder solveBuilder = new StringBuilder();

      if (howManyNumbersLeft==0){
          return "now";
      }

    for (int i = 5; i > 0; i--) {

      final Integer timeInSolvingUnits = solveInt[i - 1];
      final String solveUnit = solveUnits[i - 1];

      if (timeInSolvingUnits > 0) {
        solveBuilder.append(timeInSolvingUnits.toString()).append(" ").append(solveUnit);
        if (timeInSolvingUnits > 1) {
          solveBuilder.append("s");
        }
        if (howManyNumbersLeft > 2) {
          solveBuilder.append(", ");
        } else if (howManyNumbersLeft > 1) {
          solveBuilder.append(" and ");
        }
        howManyNumbersLeft--;
      }
    }
    return solveBuilder.toString();
  }
}
