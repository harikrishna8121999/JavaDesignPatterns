package org.java.AbstractFactory;

public class App {
    public static void main(String[] args) {
        // Create a Warrior character using the WarriorFactory
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warriorCharacter = warriorFactory.createCharacter();
        Weapon warriorWeapon = warriorFactory.createWeapon();
        Armor warriorArmor = warriorFactory.createArmor();

        System.out.println("Warrior:");
        warriorCharacter.attack();
        warriorCharacter.defend();
        warriorWeapon.attack();
        warriorArmor.defend();

        // Create a Mage character using the MageFactory
        CharacterFactory mageFactory = new MageFactory();
        Character mageCharacter = mageFactory.createCharacter();
        Weapon mageWeapon = mageFactory.createWeapon();
        Armor mageArmor = mageFactory.createArmor();

        System.out.println("\nMage:");
        mageCharacter.attack();
        mageCharacter.defend();
        mageWeapon.attack();
        mageArmor.defend();
    }
}