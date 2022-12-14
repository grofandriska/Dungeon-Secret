package org.example.characters;

import org.example.items.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    String name = "";
    Integer healthPoint = 0;
    Integer dexterity = 0;
    Integer mannaPoints = 0;
    Integer Luck = 0;
    List<Item> inventory = new ArrayList<>();
    Boolean isHostile = false;
    Integer strength = 0;

    public Character() {
    }

    public Character(String name, Integer healthPoint, Integer dexterity, Integer mannaPoints,
                     Integer luck, List<Item> inventory, Boolean isHostile) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.dexterity = dexterity;
        this.mannaPoints = mannaPoints;
        Luck = luck;
        this.inventory = inventory;
        this.isHostile = isHostile;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", dexterity=" + dexterity +
                ", mannaPoints=" + mannaPoints +
                ", Luck=" + Luck +
                ", inventory=" + inventory +
                ", isHostile=" + isHostile +
                '}';
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getMannaPoints() {
        return mannaPoints;
    }

    public void setMannaPoints(Integer mannaPoints) {
        this.mannaPoints = mannaPoints;
    }

    public Integer getLuck() {
        return Luck;
    }

    public void setLuck(Integer luck) {
        Luck = luck;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public Boolean getHostile() {
        return isHostile;
    }

    public void setHostile(Boolean hostile) {
        isHostile = hostile;
    }


}
