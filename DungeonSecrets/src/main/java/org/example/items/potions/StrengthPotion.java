package org.example.items.potions;

import org.example.characters.Character;
import org.example.items.Item;

import java.util.List;

public class StrengthPotion extends Potion{
    Integer StrengthValue;
    public StrengthPotion() {
        super("StrengthPotion", 1);
        this.StrengthValue = 10;
    }
    public void use(Character ch){
        if (ch.getInventory().contains(this) && this.getStrengthValue() > 0 && this.getHitPoint().equals(1)) {
            ch.setStrength(ch.getStrength() + this.getStrengthValue());
            this.setStrengthValue(0);
            List<Item> p = ch.getInventory().stream().filter(item -> item.getName().equals("StrengthPotion")).toList();
            ch.getInventory().removeAll(p);
        }else {
            System.out.println("There are no StrengthPotion in your inventory");
        }
    }
    public Integer getStrengthValue() {
        return StrengthValue;
    }
    public void setStrengthValue(Integer strengthValue) {
        StrengthValue = strengthValue;
    }
}
