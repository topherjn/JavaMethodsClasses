public class Golfer {
    // instance variables aka fields
    String name;
    int score;

    // mutator method
    public void setName(String n) {
        name = n;
    }

    // accessor method
    public String getName() {
        return name;
    }

    // mutator method
    public void setScore(int s) {
        if (s > 0) {
            score = s;
        }
    }

    // accessor method
    public int getScore() {
        return score;
    }

    // simple method
    public void drive() {
        System.out.println(name + " is driving the ball.");
    }
}