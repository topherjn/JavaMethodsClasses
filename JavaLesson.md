# **Lesson: Java Methods and Classes with Game Units Example**

## **Objective**

By the end of this lesson, learners will understand:

1. The basics of Java classes and methods.
2. How inheritance and polymorphism enhance object-oriented programming.
3. Practical application of these concepts using game units as an example.

---

## **Part 1: Basics of Java Classes and Methods**

### **Introduction to Classes**

- **Definition**: A class is a blueprint for creating objects. It encapsulates fields (attributes) and methods (behaviors).
- **Example**:

    ```java
    public class Car {
        String model;
        int year;
    }
    ```

### **Introduction to Methods**

- **Definition**: Methods define the actions a class can perform.
- **Syntax**:

    ```java
    public void startEngine() {
        System.out.println("Engine started");
    }
    ```

### **Why Classes and Methods?**

- **Reuse and Maintainability**: Modular design simplifies coding and debugging.
- **Encapsulation**: Bundling data with methods restricts access and improves security.

---

## **Part 2: Expanding to Inheritance and Polymorphism**

### **Inheritance with Game Units**

- **Concept**: A base class (`Unit`) defines shared attributes and methods, while subclasses (`PlayerUnit`, `EnemyUnit`) specialize behavior.

#### **Base Class: Unit**

```java
public class Unit {
    private String name;
    private int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health is now: " + health);
    }

    public void attack(Unit target) {
        System.out.println(name + " attacks " + target.getName() + "!");
    }
}
```

#### **Subclass: PlayerUnit**

```java
public class PlayerUnit extends Unit {
    private String specialAbility;

    public PlayerUnit(String name, int health, String specialAbility) {
        super(name, health);
        this.specialAbility = specialAbility;
    }

    public void useSpecialAbility() {
        System.out.println(getName() + " uses their special ability: " + specialAbility + "!");
    }

    @Override
    public void attack(Unit target) {
        System.out.println(getName() + " heroically strikes " + target.getName() + "!");
    }
}
```

#### **Subclass: EnemyUnit**

```java
public class EnemyUnit extends Unit {
    private String enemyType;

    public EnemyUnit(String name, int health, String enemyType) {
        super(name, health);
        this.enemyType = enemyType;
    }

    @Override
    public void attack(Unit target) {
        System.out.println(getName() + " (a " + enemyType + ") attacks " + target.getName() + " with a fierce strike!");
    }
}
```

---

## **Part 3: Demonstrating Polymorphism**

### **Main Class**

```java
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
                ((PlayerUnit) unit).useSpecialAbility(); // Special action for player units
            }
            unit.attack(units.get(1)); // All units attack the second unit
        }

        // Demonstrate taking damage
        units.get(1).takeDamage(30); // The Goblin takes damage
    }
}
```

### **Output**

```java
Knight uses their special ability: Shield Bash!
Knight heroically strikes Goblin!
Goblin (a Minion) attacks Goblin with a fierce strike!
Mage uses their special ability: Fireball!
Mage heroically strikes Goblin!
Orc (a Brute) attacks Goblin with a fierce strike!
Goblin takes 30 damage. Health is now: 20.
```

---

## **Key Takeaways**

1. **Encapsulation**: `Unit` class encapsulates shared attributes and methods.
2. **Inheritance**: `PlayerUnit` and `EnemyUnit` extend the `Unit` class to share common behaviors while customizing specific actions.
3. **Polymorphism**: A list of `Unit` objects allows seamless interaction with both player and enemy units.

😊📘⚔️
