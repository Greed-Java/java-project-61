package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String question() {
        int randomNum = RandomUtils.nextInt(1, 99);
        System.out.println("Question: " + randomNum);
        if(randomNum < 2) return "no";
        for(int i = 2; i < randomNum / 2; i++) {
            if(randomNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}