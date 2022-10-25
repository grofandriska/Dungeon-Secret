package org.example.items.potions;

import org.example.characters.Character;
import org.example.items.Item;

import java.util.List;

public class HealthPotion extends Potion {

    Integer healValue;
    /*
     * constructor for Health Potion
     *
     * */
    public HealthPotion() {
        super("HealthPotion",1);
        this.healValue = 15;
    }
    /*
    * This method heals up the character if it has any potion then removes it from the inventory
    * @param ch The character that we try to heal up
    * @return -> void
    */
    public void heal(Character ch) {
        if (ch.getInventory().contains(this) && this.healValue > 0) {
            ch.setHealthPoint(ch.getHealthPoint() + this.healValue);
            this.healValue = 0;
            List<Item> p = ch.getInventory().stream().filter(item -> item.getName().equals("HealthPotion")).toList();
            ch.getInventory().removeAll(p);
        }
    }
}
