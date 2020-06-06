package com.company;

public class MediumCar extends Toys{
    private double price;
    private String nameModel;

    public MediumCar(String colour, String nameModel,  String gender, double price, double age) {
        super(colour, nameModel, gender, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MediumCar) {
            return super.equals(obj) && this.price == ((MediumCar) obj).price;
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
