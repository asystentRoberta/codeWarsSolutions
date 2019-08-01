package ArrayLeaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeaders implements ArrayLeadersInterface {

    public List arrayLeaders(int[] numbers) {

        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> leadersOfNumbers = new ArrayList<>();
        numbersList.remove(0);

        for (int i = 0; i < (numbers.length - 1); i++) {
            int sumOfNextNumbers = numbersList.stream()
                    .flatMapToInt(n -> IntStream.of(n.intValue()))
                    .sum();
            if (sumOfNextNumbers < numbers[i]) {
                leadersOfNumbers.add(numbers[i]);
            }
            numbersList.remove(0);
        }

        if (numbers[numbers.length - 1] > 0) {
            leadersOfNumbers.add(numbers[numbers.length - 1]);
        }

        return leadersOfNumbers;
    }
}

