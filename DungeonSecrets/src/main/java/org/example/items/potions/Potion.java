package org.example.items.potions;

import org.example.items.Item;

public abstract class Potion extends Item {
    String name;

    public Potion(String name, Integer hitPoint) {
        super(name, hitPoint);
    }
}
