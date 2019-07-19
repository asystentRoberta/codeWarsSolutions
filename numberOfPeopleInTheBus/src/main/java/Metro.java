import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {

        int sumOfPassenger = 0;

        for (int[] stop : stops) {
            sumOfPassenger = stop[0] - stop[1];
        }

        return sumOfPassenger;
    }


    public static int countPassengersStream(ArrayList<int[]> stops){
        return stops.stream()
                .mapToInt(x->x[0]-x[1])
                .sum();
    }
}
