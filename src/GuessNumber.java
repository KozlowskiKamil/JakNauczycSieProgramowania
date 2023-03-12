import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;
        System.out.println(numberToGuess);
        while (!wasNumberGuessed) {
            System.out.println("Podaj liczbę");
            int number = scanner.nextInt();
            if (number == numberToGuess) {
                System.out.println("zgadłeś");
                wasNumberGuessed = true;
            } else if (number < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
            } else if (number > numberToGuess) {
                System.out.println("Podałeś za dużą liczbę");
            }

        }
    }


}
