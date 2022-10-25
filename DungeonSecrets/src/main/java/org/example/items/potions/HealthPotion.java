package org.example.items.potions;

import org.example.characters.Character;

public class HealthPotion extends Potion {

    Integer healValue;

    public HealthPotion(String name, Integer hitPoint, Integer value) {
        super(name, hitPoint);
        this.setName("HealthPotion");
        this.healValue = value;
    }

    public void heal(Character ch) {
        if (ch.getInventory().contains(this) && this.healValue > 0) {
            ch.setHealthPoint(ch.getHealthPoint() + this.healValue);
            this.healValue = 0;
            ch.getInventory().removeAll(ch.getInventory().stream().filter(item1 -> item1.getName().equals("HealthPotion")).toList());
        }
    }
}
