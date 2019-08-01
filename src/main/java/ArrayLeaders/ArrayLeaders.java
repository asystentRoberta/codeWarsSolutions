package ArrayLeaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeaders {

    public static List arrayLeaders(int[] numbers) {

        List<Integer> sumOfNextNumbers = new ArrayList<>();
        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for (int i = 0; i < numbers.length; i++) {


            int sum = numbersList.stream()
                    .flatMapToInt(n->IntStream.of(n.intValue()))
                    .sum();

            sumOfNextNumbers.add(sum);
            numbersList.remove(0);
        }
        sumOfNextNumbers.add(0);
        List<Integer> leadersOfNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>sumOfNextNumbers.get(i+1)){
                leadersOfNumbers.add(numbers[i]);
            }

        }

        return leadersOfNumbers;
    }
}
