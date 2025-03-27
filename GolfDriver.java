public class GolfDriver {
    public static void main(String[] args) {
        testGolf();
    }

    public static void testGolf() {
        Golfer g1 = new Golfer();
        g1.name = "Alice";
        g1.score = 72;

        System.out.println(g1.name + " scored " + g1.score);
        // Output: Alice scored 72

        Golfer g2 = new Golfer();
        g2.name = "Bob";
        g2.score = 68;

        g2.drive();
    }
}