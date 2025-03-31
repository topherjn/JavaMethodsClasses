public class Golfer {
    // instance variables aka fields
    private String name;
    private int score;

    // constructor with parameters
    public Golfer(String name, int score) {
        setName(name);
        setScore(score);
    }

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
        if (s >= 0) {
            score = s;
        }

        else {
            System.out.println("Invalid score.");
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

    // display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nScore: " + score;
    }
}