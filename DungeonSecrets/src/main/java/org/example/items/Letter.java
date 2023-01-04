package org.example.items;

public class Letter extends Item{

    String details;

    public Letter(String name, Integer hitPoint) {
        super(name, hitPoint);
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
