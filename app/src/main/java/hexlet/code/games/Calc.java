package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "What is the result of the expression?";
    public static String[][] getQuestionAndAnswer() {
        final int MIN_OPER = 0;
        final int MAX_OPER = 3;
        String[][] result = new String[Data.ROWS][Data.COLUMNS];
        for (var row : result) {
            int a = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
            int b = RandomUtils.nextInt(Data.MIN_NUM, Data.MAX_NUM);
            int indexOperator = RandomUtils.nextInt(MIN_OPER, MAX_OPER);
            String[] operators = {" + ", " - ", " * "};
            row[0] = a + operators[indexOperator] + b;
            row[1] = Integer.toString(getAnswer(a, b, operators[indexOperator]));
        }
        return result;
    }
    public static int getAnswer(int number1, int number2, String operator) {
        switch (operator) {
            case " + ":
                return number1 + number2;
            case " - ":
                return number1 - number2;
            case " * ":
                return number1 * number2;
            default: return 0;
        }
    }
    public static void runGame() {
        Engine.gameContinuous(Calc.getCondition(), Calc.getQuestionAndAnswer());
    }
}
