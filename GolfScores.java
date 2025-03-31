public class GolfScores {
    public static void main(String[] args) {

        // Single golfers with sample data - the old way
        // (not the best way, but it works for two golfers)
        String golfer1 = "Alice";
        int score1 = 72;

        String golfer2 = "Bob";
        int score2 = 68;

        // Display the golfers' names and scores
        System.out.printf("%s scored %d\n", golfer1, score1);
        System.out.printf("%s scored %d\n", golfer2, score2);

        // Parallel arrays with sample data - a little bit fancier
        // (but still not the best way)
        String[] golfers = {"Alice", "Bob", "Charlie", "Dana", "Eli"};
        int[] scores = {72, 68, 74, 70, 69};

        displayScores(golfers, scores);

        // Display the average score    
        double averageScore = getAverageScore(scores);
        System.out.printf("Average score: %.2f\n", averageScore);
    }

    // methods as we know them so far
    private static void displayScores(String[] golfers, int[] scores) {
        // Display the golfers' names and scores
        // What know what loops are, right?

        System.out.println("Golfers and their scores:");
        for (int i = 0; i < golfers.length; i++) {
            System.out.println(golfers[i] + ": " + scores[i]);
        }
    }

    // get average score
    // (static) methods like we've been using
    private static double getAverageScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }
}