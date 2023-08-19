package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Calc {
    public static String getCondition() {
        return condition;
    }

    private static String condition = "What is the result of the expression?";
    public static String question() {
        final int minNumber = 1;
        final int maxNumber = 100;
        final int minOper = 1;
        final int maxOper = 4;
        int a = RandomUtils.nextInt(minNumber, maxNumber);
        int b = RandomUtils.nextInt(minNumber, maxNumber);
        int operand = RandomUtils.nextInt(minOper, maxOper);

        switch (operand) {
            case 1:
                System.out.println("Question: " + a + " + " + b);
                return Integer.toString(a + b);
            case 2:
                System.out.println("Question: " + a + " - " + b);
                return Integer.toString(a - b);
            case 3:
                System.out.println("Question: " + a + " * " + b);
                return Integer.toString(a * b);
        } return "Error";
    }
}
