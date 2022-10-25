package org.example;

import org.example.characters.Character;
import org.example.characters.creater.CharacterCreater;
import org.example.items.Item;
import org.example.items.potions.HealthPotion;
import org.example.items.potions.Potion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HealthPotion item = new HealthPotion();
        List<Item> inventory = new ArrayList<>();

        inventory.add(item);

        CharacterCreater create = new CharacterCreater();
        Character ch = create.initCharacter();
        ch.setInventory(inventory);

        /**Heal*/

        List<Item> p = ch.getInventory().stream().filter(item1 -> item.getName().equals("HealthPotion")).toList();
        HealthPotion healthPotion = (HealthPotion) p.get(0);
        healthPotion.use(ch);

        System.out.println(ch.getHealthPoint());

    }
}