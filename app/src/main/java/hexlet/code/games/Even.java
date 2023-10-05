package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[3][2];
        for (var row : result) {
            final int minNumber = 1;
            final int maxNumber = 100;
            int randomNum = RandomUtils.nextInt(minNumber, maxNumber);
            row[0] = Integer.toString(randomNum);
            row[1] = randomNum % 2 == 0? "yes" : "no";
        }
        return result;
    }
}
