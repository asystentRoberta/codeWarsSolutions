import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    static int stray(int[] numbers) {

        final List<Integer> collect = Arrays
                .stream(numbers)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        int frequencyCounter=0;
        for (int number : numbers) {
            if (number == collect.get(0)) {
                frequencyCounter++;
            }
        }
        if (frequencyCounter == 1) {
            return collect.get(0);
        }
        return collect.get(1);
    }
}
