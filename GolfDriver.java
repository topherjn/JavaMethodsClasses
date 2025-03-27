public class GolfDriver {
    public static void main(String[] args) {
        Golfer g1 = new Golfer();
        g1.name = "Alice";
        g1.score = 72;

        Golfer g2 = new Golfer("Bob", 68);

        System.out.println(g1.name + " scored " + g1.score);
        System.out.println(g2.name + " scored " + g2.score);
    }
}