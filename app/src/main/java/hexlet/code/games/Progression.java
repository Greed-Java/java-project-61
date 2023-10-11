package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    private static String condition = "What number is missing in the progression?";
    public static String getCondition() {
        return condition;
    }
    public static String[][] getQuestionAndAnswer() {
        String[][] result = new String[Data.ROWS][Data.COLUMNS];
        String missingNum;
        final int minLen = 5;
        final int maxLen = 11;
        final int minStep = 1;
        final int maxStep = 20;
        for (var row : result) {
            int length = RandomUtils.nextInt(minLen, maxLen);
            int step = RandomUtils.nextInt(minStep, maxStep);
            int initial = step;
            int missingNumIndex = RandomUtils.nextInt(0, length - 1);
            String[] array = getProgression(initial, step, length);
            missingNum = array[missingNumIndex];
            array[missingNumIndex] = "..";
            row[0] = String.join(" ", array);
            row[1] = missingNum;
        }
        return result;
    }
    public static String[] getProgression(int initial, int step, int length) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = Integer.toString(initial);
            initial += step;
        }
        return result;
    }
    public static void runGame() {
        Engine.gameContinuous(Progression.getCondition(), Progression.getQuestionAndAnswer());
    }
}
