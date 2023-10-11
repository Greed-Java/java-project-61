package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[Data.ROWS][Data.COLUMNS];
        for (var row : result) {
            int randomNum = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
            row[0] = Integer.toString(randomNum);
            row[1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        return result;
    }
    public static void runGame() {
        Engine.gameContinuous(Even.getCondition(), Even.getQuestionAndAnswer());
    }

}
