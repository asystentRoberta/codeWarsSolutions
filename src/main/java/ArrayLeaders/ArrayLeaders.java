package ArrayLeaders;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders implements ArrayLeadersInterface {

    public List arrayLeaders(int[] numbers) {

        List<Integer> leadersOfNumbers = new ArrayList<>();

        for (int i = numbers.length - 1, sum = 0; i >= 0; i--) {
            if (numbers[i] > sum) {
                leadersOfNumbers.add(0, numbers[i]);
            }
            sum += numbers[i];
        }

        return leadersOfNumbers;
    }
}

