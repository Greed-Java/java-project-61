package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Calc {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "What is the result of the expression?";
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[3][2];
        for (var row : result) {
            final int minNumber = 1;
            final int maxNumber = 100;
            final int minOper = 0;
            final int maxOper = 3;
            int a = RandomUtils.nextInt(minNumber, maxNumber);
            int b = RandomUtils.nextInt(minNumber, maxNumber);
            int indexOperator = RandomUtils.nextInt(minOper, maxOper);
            String[] operators = {" + ", " - ", " * "};
            switch (indexOperator) {
                case 0:
                    row[0] = a + operators[indexOperator] + b;
                    row[1] = Integer.toString(a + b);
                    break;
                case 1:
                    row[0] = a + operators[indexOperator] + b;
                    row[1] = Integer.toString(a - b);
                    break;
                case 2:
                    row[0] = a + operators[indexOperator] + b;
                    row[1] = Integer.toString(a * b);
                    break;
            }
        }
        return result;
    }
}
