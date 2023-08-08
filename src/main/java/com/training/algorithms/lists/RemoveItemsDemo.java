package com.training.algorithms.lists;

import java.util.List;

public class RemoveItemsDemo {
    public void removeItems( List list, final int item) {
        list.removeIf(i -> i.equals(item));
    }
}
