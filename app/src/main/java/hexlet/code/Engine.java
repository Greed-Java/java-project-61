package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    static String gameName;
    public static void gameContinuous() {
        int countOfCorrect = 0;
        String expected;
        final String name = Cli.greetings();
        final int maxCorrect = 3;
        System.out.println(gameName);
        while (countOfCorrect < maxCorrect) {
            expected = gameStart();
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();

            if (answer.equals(expected)) {
                System.out.println("Correct!");
                countOfCorrect++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + expected + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (countOfCorrect == maxCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static String gameStart() {
        switch (gameName) {
            case "Answer 'yes' if the number is even, otherwise answer 'no'.":
                return Even.question();
            case "What is the result of the expression?":
                return Calc.question();
            case "Find the greatest common divisor of given numbers.":
                return Gcd.question();
            case "What number is missing in the progression?":
                return Progression.question();
            case "Answer 'yes' if given number is prime. Otherwise answer 'no'.":
                return Prime.question();
            default: return "Error";
        }
    }
}
