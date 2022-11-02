package org.example;

import org.example.characters.Character;
import org.example.characters.creater.CharacterCreate;
import org.example.items.Item;
import org.example.items.potions.HealthPotion;


import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //TODO : organise every steps into classes and methods to make code more readable -> Game initalizer should create all objects etc...

        HealthPotion item = new HealthPotion();
        List<Item> inventory = new ArrayList<>();

        inventory.add(item);

        CharacterCreate create = new CharacterCreate();
        Character ch = create.initCharacter();
        ch.setInventory(inventory);

        /**Heal*/

        List<Item> p = ch.getInventory().stream().filter(item1 -> item.getName().equals("HealthPotion")).toList();
        HealthPotion healthPotion = (HealthPotion) p.get(0);
        healthPotion.use(ch);

        System.out.println(ch.getHealthPoint());

    }
}