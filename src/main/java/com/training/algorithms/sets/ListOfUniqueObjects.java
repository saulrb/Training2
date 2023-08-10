package com.training.algorithms.sets;

import java.util.Collection;
import java.util.HashSet;

public class ListOfUniqueObjects {

    private HashSet<Items> items = new HashSet<>();
    public HashSet<Items> getUniqueObjects(String[] items) {
        for (String item : items) {
            String[] itemParts = item.split("\\|");
            this.items.add(new Items(itemParts[0].trim(), Integer.parseInt(itemParts[1].trim()), Double.parseDouble(itemParts[2].trim()), itemParts[3].trim()));
        }
        return this.items;
    }
}
