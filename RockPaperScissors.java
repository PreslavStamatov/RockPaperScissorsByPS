import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose [r]ock, [p]aper, or [s]cissors!");
        String playersInput = scanner.nextLine();
        String playersMove;

        label:
        while(true){
            switch (playersInput) {
                case "r":
                    playersMove = "Rock";
                    break label;
                case "p":
                    playersMove = "Paper";
                    break label;
                case "s":
                    playersMove = "Scissors";
                    break label;
                default:
                    System.out.println("Invalid input. Try again.");
                    playersInput = scanner.nextLine();
                    break;
            }
        }

        Random random = new Random();

        int computerInput = random.nextInt(4);
        while (computerInput == 0){

            computerInput = random.nextInt(4);

        }
        String computerMove;

        if (computerInput == 1){
            computerMove = "Rock";
            System.out.println("Computer chose Rock.");
        } else if (computerInput == 2) {
            computerMove = "Paper";
            System.out.println("Computer chose Paper.");
        } else {
            computerMove = "Scissors";
            System.out.println("Computer chose Scissors.");
        }

        if (playersMove.equals(computerMove)){
            System.out.println("Draw");
        } else if (playersMove.equals("Rock") && computerMove.equals("Scissors")
                || playersMove.equals("Scissors") && computerMove.equals("Paper")
                || playersMove.equals("Paper") && computerMove.equals("Rock")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

    }
}