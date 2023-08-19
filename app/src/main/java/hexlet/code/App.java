package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String numOfGame = scanner.next();
        switch (numOfGame) {
            case "0":
                break;
            case "1":
                Cli.greetings();
                break;
            case "2":
                Engine.gameName = Even.getCondition();
                Engine.gameContinuous();
                break;
            case "3":
                Engine.gameName = Calc.getCondition();
                Engine.gameContinuous();
                break;
            case "4":
                Engine.gameName = Gcd.getCondition();
                Engine.gameContinuous();
                break;
            case "5":
                Engine.gameName = Progression.getCondition();
                Engine.gameContinuous();
                break;
            case "6":
                Engine.gameName = Prime.getCondition();
                Engine.gameContinuous();
                break;
            default:
                System.out.println("Error!");
        }
    }
}
