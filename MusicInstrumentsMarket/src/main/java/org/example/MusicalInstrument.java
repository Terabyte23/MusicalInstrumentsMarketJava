package org.example;

public class MusicalInstrument {
    private String name;
    private double price;
    private String description;

    public MusicalInstrument(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}


