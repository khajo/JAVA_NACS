package exercise.week5.ex7;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Human implements Player {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move choose() {
        List<Move> moves = Moves.asList();
        display(moves);
        return choose(moves);
    }

    private void display(List<Move> moves) {
        System.out.println("These are your options: " + Moves.asString());
    }

    private Move choose(List<Move> moves) {
        Optional<Move> choice = Optional.empty();
        while (!choice.isPresent()) {
            System.out.println("Choose one:");
            String name = scanner.next();
            choice = Moves.get(name);
        }
        return choice.get();
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? (yes,no)");
        String choice = scanner.next();
        return "yes".equalsIgnoreCase(choice);
    }
}
