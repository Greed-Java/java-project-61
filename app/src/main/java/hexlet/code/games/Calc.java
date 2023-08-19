package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Calc {
    public static String getCondition() {
        return condition;
    }

    private final static String condition = "What is the result of the expression?";
    public static String question() {
        final int minNumber = 1;
        final int maxNumber = 100;
        final int minOper = 1;
        final int maxOper = 4;
        int a = RandomUtils.nextInt(minNumber, maxNumber);
        int b = RandomUtils.nextInt(minNumber, maxNumber);
        int operand = RandomUtils.nextInt(minOper, maxOper);

        if (operand == 1) {
            System.out.println("Question: " + a + " + " + b);
            return Integer.toString(a + b);
        } else if (operand == 2) {
            System.out.println("Question: " + a + " - " + b);
            return Integer.toString(a - b);
        } else {
            System.out.println("Question: " + a + " * " + b);
            return Integer.toString(a * b);
        }
    }
}
