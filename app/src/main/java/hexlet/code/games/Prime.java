package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[][] getQuestionAndAnswer() {
        final int rows = 3;
        final int columns = 2;
        String[][] result = new String[rows][columns];
        final int minNum = 1;
        final int maxNum = 99;
        for (var row : result) {
            int randomNum = RandomUtils.nextInt(minNum, maxNum);
            row[0] = Integer.toString(randomNum);
            row[1] = isPrime(randomNum);
        }
        return result;
    }
    public static String isPrime(int num) {
        if (num < 2) {
            return "no";
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
