package com.company;

public abstract class Toys {
    private String colour;
    private double price;

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }
    public String getNameModel() {
        return nameModel;
    }




    private double age;
    private String gender;
    private String nameModel;

    public Toys(String colour, String nameModel,  String gender, double price, double age) {
        this.colour = colour;
        this.gender = gender;
        this.age = age;
        this.price = price;
        this.nameModel = nameModel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Toys) {
            return colour.equals(((Toys) obj).colour) &&
                    gender == ((Toys) obj).gender &&
                    age == ((Toys) obj).age &&
                    price == ((Toys) obj).price &&
                    nameModel.equals(((Toys) obj).nameModel);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Colour: " + colour
                + "\nGender: " + gender
                + "\nMinimum age: " + age
                ;
    }
}