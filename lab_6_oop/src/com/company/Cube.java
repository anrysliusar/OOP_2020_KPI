package com.company;

public class Cube extends Toys{
    private double price;
    private String nameModel;

    public Cube(String colour, String nameModel,  String gender, double price, double age) {
        super(colour, nameModel, gender, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cube) {
            return super.equals(obj) && this.price == ((Cube) obj).price;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPrice: " + price +
                "\nName: " + nameModel + "\n";
    }
}
