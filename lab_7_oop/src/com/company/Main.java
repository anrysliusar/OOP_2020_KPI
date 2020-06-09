package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        /*C2 = 1 == Set
        C3 = 2 == Doubly-linked-list */
        MySet mySet = new MySet();
        mySet.add(new SmallCar("Blue", "Hudson Hornet", "Male", 45, 2));
        mySet.add(new SmallCar("Blue", "Hudson Hornet", "Male", 45, 2));
        mySet.add(new MediumCar("Blue", "Porsche 911 Carrera", "Female", 56, 3));
        mySet.add(new MediumCar("Black", "McQueen", "Male", 60, 3));
    }

}
