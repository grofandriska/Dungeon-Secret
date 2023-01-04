package org.example.characters.mobs;

import org.example.characters.Character;
import org.example.items.Item;

import java.util.List;

public class Skeleton extends Character {

    public Skeleton() {
        this.setHealthPoint(100);
        this.setStrength(25);
        this.setDexterity(10);
        this.setLuck(1);
        this.setHostile(true);
        this.setName("Mob1");
        this.setInventory(null);
    }

    public Skeleton(String name, Integer healthPoint, Integer dexterity, Integer mannaPoints, Integer luck, List<Item> inventory, Boolean isHostile) {
        super(name, healthPoint, dexterity, mannaPoints, luck, inventory, isHostile);
    }
}
