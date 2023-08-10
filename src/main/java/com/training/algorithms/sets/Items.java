package com.training.algorithms.sets;

public class Items {
    private String name;
    private int quantity;
    private double price;
    private String description;

    public Items(String name, int quantity, double price, String description) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + quantity + (int)price + description.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Items)) return false;
        Items other = (Items)obj;
        return name.equals(other.name) && quantity == other.quantity && price == other.price && description.equals(other.description);
    }

    @Override
    public String toString() {
        return String.format("Items{name=%s, quantity=%d, price=%f, description=%s}", name, quantity, price, description);
    }
}
