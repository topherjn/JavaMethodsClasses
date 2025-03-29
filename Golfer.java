public class Golfer {
    // instance variables aka fields
    public String name;
    public int score;

    // constructor
    // The default constuctor looks like this
    // when it is not declared
    public Golfer() {
        // Note that this is empty
    }

    // overloaded constructor with parameters
    public Golfer(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
}