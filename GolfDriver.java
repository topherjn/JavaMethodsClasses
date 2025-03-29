public class GolfDriver {

    public static void main(String[] args) {

        // Instance of Golfer class aka Golfer object
        // Assigned to Golfer data type (class)
        // Values assigned to the fields aka instance variables
        // of the Golfer object
        // Reference of the Golfer object assigned to the Golfer data type
        // variable
        Golfer g1 = new Golfer();
        g1.name = "Alice";
        g1.score = 72;

        System.out.println(g1.name + " scored " + g1.score);
        // Output: Alice scored 72
    }
}