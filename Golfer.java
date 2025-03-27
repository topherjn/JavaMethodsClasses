public class Golfer {
    // instance variables aka fields
    private String name;
    private int score;

    public Golfer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // simple method
    public void drive() {
        System.out.println(name + " is driving the ball.");
    }

    // display method
    public void display() {
        System.out.println("Name: " + name + ", Score: " + score);
    }
}