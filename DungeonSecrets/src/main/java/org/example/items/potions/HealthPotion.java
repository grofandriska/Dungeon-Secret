package org.example.items.potions;

import org.example.characters.Character;
import org.example.items.Item;
import java.util.List;
public class HealthPotion extends Potion {
    Integer healValue;
    /**
     * constructor for Health Potion
     *
     * */
    public HealthPotion() {
        super("HealthPotion",1);
        this.healValue = 15;
    }
    /**
    * This method heals up the character if it has any potion ,then removes it from the inventory
    * @param ch The character that we try to heal up
    * @return -> void, and the character stat is updated.
    */

    /**Maybe this method could go into Charachter class since it's containing potions in his inventory and its should be encapsulated there*/
    public void use(Character ch) {
        if (ch.getInventory().contains(this) && this.healValue > 0 && this.getHitPoint().equals(1)) {
            ch.setHealthPoint(ch.getHealthPoint() + this.healValue);
            this.healValue = 0;
            List<Item> p = ch.getInventory().stream().filter(item -> item.getName().equals("HealthPotion")).toList();
            ch.getInventory().removeAll(p);
        } else {
            System.out.println("There are no HealthPotion in your inventory");
        }
    }
}
