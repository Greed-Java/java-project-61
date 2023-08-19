package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static String getCondition() {
        return condition;
    }

    private static String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String question() {
        int randomNum = RandomUtils.nextInt(1, 99);
        System.out.println("Question: " + randomNum);
        if (randomNum % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
