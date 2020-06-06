package com.company;

public class BigCar extends Toys{
    private double price;
    private String nameModel;

    public BigCar(String colour, String nameModel,  String gender, double price, double age) {
        super(colour, nameModel, gender, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BigCar) {
            return super.equals(obj) && this.price == ((BigCar) obj).price;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPrice: " + price +
                "\nName of Car: " + nameModel + "\n";
    }
}

