package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] getQuestionAndAnswer() {
        final int rows = 3;
        final int columns = 2;
        String[][] result = new String[rows][columns];
        final int minNumber = 1;
        final int maxNumber = 100;
        for (var row : result) {
            int randomNum = RandomUtils.nextInt(minNumber, maxNumber);
            row[0] = Integer.toString(randomNum);
            row[1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        return result;
    }
}
