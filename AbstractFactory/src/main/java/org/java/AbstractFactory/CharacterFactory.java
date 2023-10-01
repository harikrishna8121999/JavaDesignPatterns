package org.java.AbstractFactory;

// Step 1: Abstract Factory Interface
public interface CharacterFactory {
    Character createCharacter();
    Weapon createWeapon();
    Armor createArmor();
}
