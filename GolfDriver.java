public class GolfDriver {

    public static void main(String[] args) {

        // Instance of Golfer class aka Golfer object
        // Assigned to Golfer data type (class)
        // Values assigned to the fields aka instance variables
        // of the Golfer object
        // Reference of the Golfer object assigned to the Golfer data type
        // variable
        Golfer golfer = new Golfer();
        golfer.name = "Alice";
        golfer.score = 72;

        // printing the values of the fields of the Golfer object
        System.out.println("Golfer Name: " + golfer.name);

        // overwriting the values of the fields of the Golfer object
        // with new values
        golfer.name = "Bob";
        golfer.score = 68;

        // printing the new values of the fields of the Golfer object
        System.out.println("Golfer Name: " + golfer.name);
        System.out.println("Golfer Score: " + golfer.score);

        // creating a new Golfer object
        Golfer golfer2 = new Golfer();      
        golfer2.name = "Charlie";
        golfer2.score = 70;

        // printing the values of the fields of the new Golfer object       
        System.out.println("Golfer Name: " + golfer2.name);
        System.out.println("Golfer Score: " + golfer2.score);


        
    }
}