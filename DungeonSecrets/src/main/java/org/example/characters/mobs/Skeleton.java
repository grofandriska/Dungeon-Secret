package org.example.characters.mobs;

import org.example.characters.Character;
import org.example.items.Item;

import java.util.List;

public class Skeleton extends Character {
    public Skeleton(String name, Integer healthPoint, Integer dexterity, Integer mannaPoints, Integer luck, List<Item> inventory, Boolean isHostile) {
        super(name, healthPoint, dexterity, mannaPoints, luck, inventory, isHostile);
    }
}
