package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Progression {
    private final static String condition = "What number is missing in the progression?";

    public static String getCondition() {
        return condition;
    }

    //public static String missingNum;
    public static String question() {

        String missingNum = null;
        final int minLen = 5;
        final int maxLen = 11;
        final int minStep = 1;
        final int maxStep = 20;
        int length = RandomUtils.nextInt(minLen, maxLen);
        int step = RandomUtils.nextInt(minStep, maxStep);
        int result = step;
        int missingNumIndex = RandomUtils.nextInt(0, length - 1);
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.toString(result);
            if (i == missingNumIndex) {
                missingNum = array[i];
                array[i] = "..";
            }
            result += step;
        }
        System.out.print("Question: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        return missingNum;
    }
}
