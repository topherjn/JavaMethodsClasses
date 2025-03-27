public class Unit {

    // instance variables aka fields
    private String name;
    private int health;

    // constructor
    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // methods

    // accessor for name aka getter
    public String getName() {
        return name;
    }

    // accessor for health
    public int getHealth() {
        return health;
    }

    // method to deduct health
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health is now: " + health);
    }

    // method to attack another unit (largely cosmetic)
    public void attack(Unit target) {
        System.out.println(name + " attacks " + target.getName() + "!");
    }
}

