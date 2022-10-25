package org.example.characters;

import org.example.behavour.CharacterActions;
import org.example.items.Item;

import java.util.List;

public class Archer extends Character implements CharacterActions {


    public Archer() {}
    public Archer(String name, Integer healthPoint, Integer dexterity, Integer mannaPoints, Integer luck, List<Item> inventory, Boolean isHostile) {
        super(name, healthPoint, dexterity, mannaPoints, luck, inventory, isHostile);
    }

    @Override
    public String makeWarCry() {
        return null;
    }

    @Override
    public String dialog() {
        return null;
    }

    @Override
    public void heal() {

    }
}
