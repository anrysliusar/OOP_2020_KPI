package com.company;

public class SmallCar extends Toys {
    private String nameModel;
    private double price;
    public SmallCar(String colour, String nameModel,  String gender, double price, double age) {
        super(colour, nameModel, gender, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SmallCar) {
            return super.equals(obj) && this.price == ((SmallCar) obj).price;
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
