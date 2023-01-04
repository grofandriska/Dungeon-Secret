package org.example.characters.creater;

import org.example.characters.Archer;
import org.example.characters.Character;
import org.example.characters.Mage;
import org.example.characters.Warrior;

import java.util.Scanner;

/**
 * This class will be a builder or factory for creating new characters
 */
public class CharacterCreate {

    Scanner scanner = new Scanner(System.in);

    Integer ValuePool;

    public CharacterCreate() {
        ValuePool = 50;
    }

    /**
     * This method helps to init the character at the start of the game . We have 50 point for distribution ( for now )
     */
    public Character initCharacter() {
        Character character = null;
        while (character == null) {
        System.out.println(("Choose a type you want to play \n" + "1 -> Warrior \n" + "2 -> Archer \n" + "3 -> Mage"));
        String str = scanner.nextLine();
            if (str.equals("1")) {
                character = new Warrior();
            } else if (str.equals("2")) {
                character = new Archer();
            } else if (str.equals("3")) {
                character = new Mage();
            }
        }
        System.out.println("--------------Build Stats--------------------------");
        while (ValuePool > 0) {
            /**This is the main logic and dialog for creating the character
            *
            * */
            System.out.println("You have got " + ValuePool + " point(s) left to distribute.");
            System.out.println();
            System.out.println("Hp: " + character.getHealthPoint());
            System.out.println("Strength: " + character.getStrength());
            System.out.println("Dexterity: " + character.getDexterity());
            System.out.println("Luck: " + character.getLuck());
            System.out.println("Manna: " + character.getMannaPoints());
            System.out.println();
            System.out.println( "Please choose an attribute to increase it's value !" + "\n" +"1 : health\n2 : Strength\n3 : Dexterity\n4 : Luck\n5 : Manna");
            String s = scanner.nextLine();

            /**Here we distribute the point while @param ValuePool is >0*/

            if (s.equals("1")) {
                character.setHealthPoint(character.getHealthPoint() + 1);
            } else if (s.equals("2")) {
                character.setStrength(character.getStrength() + 1);
            } else if (s.equals("3")) {
                character.setDexterity(character.getDexterity() + 1);
            } else if (s.equals("4")) {
                character.setLuck(character.getLuck() + 1);
            } else if (s.equals("5")) {
                character.setMannaPoints(character.getMannaPoints() + 1);
            } else {
                continue;
            }
            ValuePool -= 1;
        }
        scanner.close();
        return character;
    }
}
