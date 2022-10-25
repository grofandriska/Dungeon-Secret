package org.example.characters.creater;

import org.example.characters.Archer;
import org.example.characters.Character;
import org.example.characters.Mage;
import org.example.characters.Warrior;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * This class will be a builder or abstract factory for create new characters
 */
public class CharacterCreater {

    Scanner scanner = new Scanner(System.in);

    Integer ValuePool;

    public CharacterCreater() {
        ValuePool = 50;
    }

    public Character initCharacter() {
        Character character;
        System.out.println(("Choose a type you want to play \n" + "1 -> Warrior \n" + "2-> Archer \n" + "3 -> Mage"));
        String str = scanner.nextLine();
        if (str.equals("1")) {
            character = new Warrior();
        } else if (str.equals("2")) {
            character = new Archer();
        } else {
            character = new Mage();
        }
        while (ValuePool > 0) {
            System.out.println("You have got " + ValuePool + "point left to distribute");
            System.out.println("Please choose an attribute to increase it's value");
            System.out.println("The stats are Hp:" + character.getHealthPoint());
            System.out.println("Strength:" + character.getStrength());
            System.out.println("Dexterity:" + character.getDexterity());
            System.out.println("Luck:" + character.getLuck());
            System.out.println("Manna:" + character.getMannaPoints());
            System.out.println("1 : health, 2 : Strength , 3 : Dexterity, 4 : Luck , 5 : Manna");
            String s = scanner.nextLine();
            switch (s) {
                case "1" -> character.setHealthPoint(character.getHealthPoint() + 1);
                case "2" -> character.setStrength(character.getStrength() + 1);
                case "3" -> character.setDexterity(character.getDexterity() + 1);
                case "4" -> character.setLuck(character.getLuck() + 1);
                case "5" -> character.setMannaPoints(character.getMannaPoints() + 1);
            }
            ValuePool-=1;
        }
        return character;
    }
}
