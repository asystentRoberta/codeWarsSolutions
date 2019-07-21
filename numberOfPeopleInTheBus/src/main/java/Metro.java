import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {

        int sumOfPassenger = 0;

        for (int[] stop : stops) {
            int exitParameter = 0;
            for (int i : stop) {
                if (exitParameter == 1) {
                    i *= -1;
                }
                sumOfPassenger += i;
                exitParameter = 1;
            }
        }

        return sumOfPassenger;
    }


    public static int countPassengersStream(ArrayList<int[]> stops){
        return stops.stream()
                .mapToInt(x->x[0]-x[1])
                .sum();
    }
}
