package org.example;

import org.example.characters.Character;
import org.example.characters.Mage;
import org.example.items.Item;
import org.example.items.potions.HealthPotion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HealthPotion item = new HealthPotion();
        List<Item> inventory = new ArrayList<>();
        inventory.add(item);


        Character ch = new Mage("Gandalf",100,3,50,5, inventory,false);
        item.use(ch);

        System.out.println(ch.getHealthPoint());
        System.out.println(ch.getInventory());
    }
}