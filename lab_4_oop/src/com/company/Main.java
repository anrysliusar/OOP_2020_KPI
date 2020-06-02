package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        C11 = 6 - create class cosmetics with 5+ fields
//        Create array of objects
//        Sort array of objects
        Cosmetics[] cosm = new Cosmetics[4];
        cosm[0] = new Cosmetics("Middle Market", "for hands", "cream", "Nivea", 50);
        cosm[1] = new Cosmetics("Mass market", "for hair", "shampoo", "L’Oreal", 240);
        cosm[2] = new Cosmetics("Professional", "face", "eyebrow pencil", "Kryolan", 120);
        cosm[3] = new Cosmetics("LUX", "for skin", "conditioner", "Guerlain", 170);
//        planes[3] = new Airplane("Antonov An-225", 800, 15400, 250000, 1300);
//        Arrays.sort(planes, Comparator.comparing(Airplane::getModel));
        Arrays.sort(cosm, Comparator.comparing(Cosmetics::getName).reversed().thenComparing(Cosmetics::getWeight));
        for (Cosmetics cos : cosm) {
            System.out.println(cos);
        }
    }
}