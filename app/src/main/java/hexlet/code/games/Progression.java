package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Progression {
    private static String condition = "What number is missing in the progression?";
    public static String getCondition() {
        return condition;
    }
    public static String[][] getQuestionAndAnswer() {
        final int rows = 3;
        final int columns = 2;
        String[][] result = new String[rows][columns];
        String missingNum = null;
        final int minLen = 5;
        final int maxLen = 11;
        final int minStep = 1;
        final int maxStep = 20;
        for (var row : result) {
            int length = RandomUtils.nextInt(minLen, maxLen);
            int step = RandomUtils.nextInt(minStep, maxStep);
            int num = step;
            int missingNumIndex = RandomUtils.nextInt(0, length - 1);
            String[] array = new String[length];
            for (int i = 0; i < length; i++) {
                array[i] = Integer.toString(num);
                if (i == missingNumIndex) {
                    missingNum = array[i];
                    array[i] = "..";
                }
                num += step;
            }
            row[0] = String.join(" ", array);
            row[1] = missingNum;
        }
        return result;
    }
}
