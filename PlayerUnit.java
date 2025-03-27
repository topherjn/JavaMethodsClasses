public class PlayerUnit extends Unit {

    // instance variable
    private String specialAbility;

    public PlayerUnit(String name, int health, String specialAbility) {
        super(name, health);
        this.specialAbility = specialAbility;
    }

    // only player units have special abilities
    public void useSpecialAbility() {
        System.out.println(getName() + " uses his special ability: " + specialAbility + "!");
    }

    // player units attack "heroically"
    @Override
    public void attack(Unit target) {
        System.out.println(getName() + " heroically strikes " + target.getName() + "!");
    }
}