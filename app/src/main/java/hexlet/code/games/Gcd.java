package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Find the greatest common divisor of given numbers.";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[Data.ROWS][Data.COLUMNS];
        for (var row : result) {
            int a = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
            int b = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
            row[0] = a + " " + b;
            row[1] = Integer.toString(gcd(a, b));
        }
        return result;
    }
    static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
    public static void runGame() {
        Engine.gameContinuous(Gcd.getCondition(), Gcd.getQuestionAndAnswer());
    }
}
