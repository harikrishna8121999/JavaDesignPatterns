package org.java.AbstractFactory;

public class MageFactory implements CharacterFactory{
    public Character createCharacter() {
        return new Mage();
    }
    public Weapon createWeapon() {
        return new Staff();
    }
    public Armor createArmor() {
        return new Robe();
    }
}
