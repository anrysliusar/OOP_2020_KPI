package com.company;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 instanceof Toys && obj2 instanceof Toys) {
            return Double.compare(((Toys) obj1).getPrice(), ((Toys) obj2).getPrice());
        }
        return -2;
    }
}
