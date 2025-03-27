public class GolfScores {
    public static void main(String[] args) {

        // Single golfers

        String golfer1 = "Alice";
        int score1 = 72;

        String golfer2 = "Bob";
        int score2 = 68;

        System.out.printf("%s scored %d\n", golfer1, score1);
        System.out.printf("%s scored %d\n", golfer2, score2);

        // Parallel arrays with sample data - a little bit fancier
        String[] golfers = {"Alice", "Bob", "Charlie", "Dana", "Eli"};
        int[] scores = {72, 68, 74, 70, 69};

        // Display the golfers' names and scores
        System.out.println("Golfers and their scores:");
        for (int i = 0; i < golfers.length; i++) {
            System.out.println(golfers[i] + ": " + scores[i]);
        }
    }
}