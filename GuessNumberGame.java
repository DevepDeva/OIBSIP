import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GuessNumberGame {
    public static void game() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int counter = 6;
        int i, guess;
        System.out.println(
                "A number is choosen " + "between 1 to 100." + "Guess the number " + "within 6 trails.");
        for (i = 0; i < counter; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + "You guessed the number.");
            } else if (number > guess && i != counter - 1) {
                System.out.println("The number is" + "greater than" + guess);

            } else if (number < guess && i != counter - 1) {
                System. out.println("The number is " + "less than " + guess);

            }
        }
        if (i == counter) {
            System.out.println("You have exhausted " + "K trails.");
            System.out.println("The number was" + number);
        }


    }

    public static void main(String args[])
    {
        game();
    }
}