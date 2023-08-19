package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Calc {
    public static String getCondition() {
        return condition;
    }

    private static String condition = "What is the result of the expression?";
    public static String question() {
        int a = RandomUtils.nextInt(1, 100);
        int b = RandomUtils.nextInt(1, 100);
        int operand = RandomUtils.nextInt(1, 4);

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
