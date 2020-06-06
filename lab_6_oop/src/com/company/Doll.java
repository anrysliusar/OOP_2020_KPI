package com.company;

public class Doll extends Toys{
    private double price;
    private String nameModel;

    public Doll(String colour, String nameModel,  String gender, double price, double age) {
        super(colour, nameModel, gender, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Doll) {
            return super.equals(obj) && this.price == ((Doll) obj).price;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPrice: " + price +
                "\nName of doll: " + nameModel + "\n";
    }
}
