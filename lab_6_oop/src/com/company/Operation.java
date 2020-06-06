package com.company;

import java.util.ArrayList;

public class Operation {
    private double carryingCapacity;
    private ArrayList<Toys> load = new ArrayList<>();
    private double priceOfRoom;
    private double price;


    public ArrayList<Toys> getLoad() {
        return load;
    }

    public void printLoad() {
        for (Toys toys : load) {
            System.out.println(toys);
        }
    }




    public Operation() {
        this.priceOfRoom = 0;
        this.price = 0;
    }

    private void loader(Toys[] toys, double budget) {
        for (Toys toy : toys) {
            if (priceOfRoom + toy.getPrice() <= budget) {

                priceOfRoom += toy.getPrice();
                load.add(toy);
            } else {
                return;
            }
        }
    }

    public void loadRoom(SmallCar[] smallCars, MediumCar[] mediumCars, BigCar[] bigCars, Ball[] balls, Doll[] dolls, Cube[] cubes, double budget) {
        double minPrice = smallCars[0].getPrice();
        checker(smallCars, minPrice);
        checker(mediumCars, minPrice);
        checker(bigCars, minPrice);
        checker(balls, minPrice);
        checker(dolls, minPrice);
        checker(cubes, minPrice);

        load.clear();
        if (budget < minPrice) return;
        while (priceOfRoom + minPrice < budget) {
            loader(smallCars, budget);
            loader(mediumCars, budget);
            loader(bigCars, budget);
            loader(balls, budget);
            loader(dolls, budget);
            loader(cubes, budget);
        }
    }

    public ArrayList<Toys> finderGivenRange(double minBorder, double maxBorder) {
        ArrayList<Toys> itemsInRange = new ArrayList<>();
        for (Toys toys: load) {
            if (toys.getPrice() >= minBorder && toys.getPrice() <= maxBorder) itemsInRange.add(toys);
        }
        if (itemsInRange.size() == 0)
            System.out.println("No toys found in this price range");
        return itemsInRange;
    }

    private void checker(Toys[] toys, double minPrice) {
        for (Toys toy : toys) {
            if (toy.getPrice() < minPrice) minPrice = toy.getPrice();
        }
    }
}