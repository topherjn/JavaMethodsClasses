public class GolfDriver {
    public static void main(String[] args) {
        testGolf();
    }

    public static void testGolf() {
        Golfer g1 = new Golfer("Alice", 72);
        Golfer g2 = new Golfer("Bob", 68);

        // Alice
        g1.display();
        g1.drive();

        // Bob
        g2.display();
        g2.drive();
    }
}