package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String numOfGame = scanner.next();
        switch (numOfGame) {
            case "0":
                break;
            case "1":
                Cli.greetings();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                Gcd.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            default:
                System.out.println("Error!");
        }
    }
}
