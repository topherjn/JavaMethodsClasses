public class Golfer {
    // instance variables aka fields
    // private access modifier means that these variables are not accessible outside this class
    private String name;
    private int score;

    // Note that the parameterless constructor has been 
    // removed.  Now there is no default constructor 
    // because of the constructor defined below
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