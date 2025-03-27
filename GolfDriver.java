public class GolfDriver {
    public static void main(String[] args) {
        Golfer g1 = new Golfer("Alice", 72);

        System.out.println("Name: " + g1.getName());
        System.out.println("Score: " + g1.getScore());  

        // attempt to change to an invalid score
        g1.setScore(-1);

        // change to a valid score
        g1.setScore(99);

        // display()
        g1.display();

        // vs toString()
        System.out.println(g1);
    

    }
}