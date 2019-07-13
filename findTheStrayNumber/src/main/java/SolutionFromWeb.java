import java.util.Arrays;

public class SolutionFromWeb {

    static int firstStray(int[] numbers) {

        // This solution doesn't work. It's from codewars. Thet have bad tests...
        //Oh! It works. The content of the task was: odd-length!
        int sum = 0;
        for (int c : numbers) {
//        sum ^= c;
            sum = sum ^ c;
        }
        return sum;
    }

    static int secondStray(int[] numbers) {

        return java.util.stream.IntStream.of(numbers).reduce(0, (a, b) -> a ^ b);
    }

    static int thirdStray(int[] numbers) {

        // Clever
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }
}
