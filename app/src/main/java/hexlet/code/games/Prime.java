package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static String getCondition() {
        return condition;
    }
    private static String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String question() {
        int minNum = 1;
        int maxNum = 99;
        int randomNum = RandomUtils.nextInt(minNum, maxNum);
        System.out.println("Question: " + randomNum);
        if (randomNum < 2) {
            return "no";
        }
        for (int i = 2; i < randomNum / 2; i++) {
            if (randomNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
