package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static String getCondition() {
        return condition;
    }

    private final static String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String question() {
        final int minNumber = 1;
        final int maxNumber = 100;
        int randomNum = RandomUtils.nextInt(minNumber, maxNumber);
        System.out.println("Question: " + randomNum);
        if (randomNum % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
