package exercise.week5.ex7;

public class Judge {

    public String judge(Move move1, Move move2) {
        display(move1, move2);
        return findWinner(move1, move2);
    }

    private void display(Move move1, Move move2) {
        System.out.println("Player 1 chose: " + move1.getName());
        System.out.println("Player 2 chose: " + move2.getName());
    }

    String findWinner(Move move1, Move move2) {
        if (move1.defeats(move2)) {
            return "You win!";
        }
        if (move2.defeats(move1)) {
            return "The computer wins!";
        }
        return "Nobody wins!";
    }

}
