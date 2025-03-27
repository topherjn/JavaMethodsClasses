import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of game units
        ArrayList<Unit> units = new ArrayList<>();
        
        // Add player and enemy units
        units.add(new PlayerUnit("Knight", 100, "Shield Bash"));
        units.add(new EnemyUnit("Goblin", 50, "Minion"));
        units.add(new PlayerUnit("Mage", 80, "Fireball"));
        units.add(new EnemyUnit("Orc", 120, "Brute"));

        // Demonstrate polymorphism with attacks
        for (Unit unit : units) {
            if (unit instanceof PlayerUnit) {
                // downcast to call the special ability method
                ((PlayerUnit) unit).useSpecialAbility(); // Special action for player units
            }
            unit.attack(units.get(1)); // All units attack the second unit
        }

        // Demonstrate taking damage
        units.get(1).takeDamage(30); // The Goblin takes damage
    }
}