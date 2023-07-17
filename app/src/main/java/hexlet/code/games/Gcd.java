package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    public static String condition = "Find the greatest common divisor of given numbers.";
    public static String question() {
        int a = RandomUtils.nextInt(1, 100);
        int b = RandomUtils.nextInt(1, 100);
        System.out.println("Question: " + a + " " + b);
        return Integer.toString(gcd(a, b));
    }
    static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
