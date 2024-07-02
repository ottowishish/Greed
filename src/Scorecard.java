import java.util.Arrays;

public class Scorecard {
    // represents a scorecard to keep track of the scores
    private final int[] score;

    public Scorecard(int players) {
        // creates a scorecard for a number of players and sets all the scores to 0
        score = new int[players];
        Arrays.fill(score, 0);
    }

    public void setPlayerScore(int player, int points) {
        // increases the player's score by a number of points
        score[player] = score[player] + points;
    }

    public int getPlayerScore(int player) {
        // returns the player's score
        return score[player];
    }

    public void printScores() {
        // prints all the score
        System.out.println("--- -- --- -- --- -- --- -- ---");
        System.out.println("Scores:");

        for(int i = 0; i < score.length; i++)
            System.out.printf("\tPlayer %s: %s%n", (i+1), getPlayerScore(i));

        System.out.println("--- -- --- -- --- -- --- -- ---");
        System.out.println("\n");
    }
}