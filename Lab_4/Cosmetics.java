package com.company;


public class Cosmetics {
    private String category;
    private String appointment;
    private String name;
    private String trademark;
    private int weight;

    public Cosmetics() {
        new Cosmetics("Unknown", "Unknown", "Unknown", "Unknown", 0);
    }

    public Cosmetics(String category, String appointment, String name, String trademark, int weight) {
        this.category = category;
        this.appointment = appointment;
        this.name = name;
        this.trademark = trademark;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Category of cosmetics:  "+ category
                + ", appointment: " + appointment
                + ", name: " + name
                + ", trademark: " + trademark
                + ", weight: " + weight;
    }
}
