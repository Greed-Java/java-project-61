package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[Data.ROWS][Data.COLUMNS];
        for (var row : result) {
            int randomNum = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
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
    public static void runGame() {
        Engine.gameContinuous(Prime.getCondition(), Prime.getQuestionAndAnswer());
    }
}
