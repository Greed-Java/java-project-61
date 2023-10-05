package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Find the greatest common divisor of given numbers.";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[3][2];
        for (var row : result) {
            final int minNumber = 1;
            final int maxNumber = 100;
            int a = RandomUtils.nextInt(minNumber, maxNumber);
            int b = RandomUtils.nextInt(minNumber, maxNumber);
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
}
