package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class Engine {
    static int countOfCorrect = 0;
    static String name = Cli.greetings();
    static String expected;
    static String gameName;
    public static void gameContinuous() {
        System.out.println(gameName);
        while (countOfCorrect < 3) {
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
        if (countOfCorrect == 3) {
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
        } return null;
    }
}