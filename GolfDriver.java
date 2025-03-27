public class GolfDriver {

    public static void main(String[] args) {
        Golfer g1 = new Golfer();
        g1.name = "Alice";
        g1.score = 72;

        System.out.println(g1.name + " scored " + g1.score);
        // Output: Alice scored 72
    }
}