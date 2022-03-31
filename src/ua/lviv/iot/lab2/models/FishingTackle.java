package ua.lviv.iot.lab2.models;

import ua.lviv.iot.lab2.models.TypeOfFishing;

public class FishingTackle{
    private String name;
    private String description;
    private float price;
    private int amount;
    private TypeOfFishing type;

    public FishingTackle(String name, String description, float price, int amount, TypeOfFishing type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }
}
