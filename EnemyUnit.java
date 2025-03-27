public class EnemyUnit extends Unit {

    // instance variable
    private String enemyType;

    // constructor
    public EnemyUnit(String name, int health, String enemyType) {
        super(name, health);
        this.enemyType = enemyType;
    }

    // method - ememies attack differently from other units.  polymormphism
    @Override
    public void attack(Unit target) {
        System.out.println(getName() + " (a " + enemyType + ") attacks " + target.getName() + " with a fierce strike!");
    }
}