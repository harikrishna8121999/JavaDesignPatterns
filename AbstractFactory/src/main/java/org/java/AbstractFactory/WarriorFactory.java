package org.java.AbstractFactory;

// Step 2: Concrete Factory Classes
public class WarriorFactory implements CharacterFactory{
    public Character createCharacter() {
        return new Warrior();
    }
    public Weapon createWeapon() {
        return new Sword();
    }
    public Armor createArmor() {
        return new PlateArmor();
    }
}
