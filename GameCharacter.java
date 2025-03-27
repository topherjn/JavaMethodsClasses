public class GameCharacter {
    // Attributes
    private String name;
    private int health;
    private int attackPower;
    private String specialAbility;

    // Constructor
    public GameCharacter(String name, int health, int attackPower, String specialAbility) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.specialAbility = specialAbility;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    // Methods
    public void attack(GameCharacter target) {
        System.out.println(name + " attacks " + target.getName() + " with " + attackPower + " power!");
        target.setHealth(target.getHealth() - attackPower);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses the special ability: " + specialAbility + "!");
    }

    public void displayStats() {
        System.out.println("Character Stats:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Special Ability: " + specialAbility);
    }

    public static void main(String[] args) {
        // Example usage
        GameCharacter hero = new GameCharacter("Hero", 100, 20, "Fireball");
        GameCharacter villain = new GameCharacter("Villain", 80, 15, "Shadow Strike");

        hero.displayStats();
        villain.displayStats();

        hero.attack(villain);
        villain.useSpecialAbility();

        hero.displayStats();
        villain.displayStats();
    }
}