package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gameContinuous(String condition, String[][] questionAndAnswer) {
        int countOfCorrect = 0;
        final String name = Cli.greetings();
        System.out.println(condition);
        for (var row : questionAndAnswer) {
            System.out.println("Question: " + row[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equals(row[1])) {
                System.out.println("Correct!");
                countOfCorrect++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + row[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (countOfCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
