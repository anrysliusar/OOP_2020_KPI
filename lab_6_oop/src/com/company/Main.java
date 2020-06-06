package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<SmallCar> smallCars = new ArrayList<>();
        ArrayList<MediumCar> mediumCars = new ArrayList<>();
        ArrayList<BigCar> bigCars = new ArrayList<>();
        ArrayList<Doll> dolls = new ArrayList<>();
        ArrayList<Ball> balls = new ArrayList<>();
        ArrayList<Cube> cubes = new ArrayList<>();


        smallCars.add(new SmallCar("Red", "Fiat 500", "Male", 40, 2));
        smallCars.add(new SmallCar("Yellow", "Plymouth Superbird", "Male", 35, 2));
        smallCars.add(new SmallCar("Blue", "Hudson Hornet", "Male", 45, 2));

        mediumCars.add(new MediumCar("Blue", "Porsche 911 Carrera", "Female", 56, 3));
        mediumCars.add(new MediumCar("Black", "McQueen", "Male", 60, 3));
        mediumCars.add(new MediumCar("Green", "Chevrolet Impala", "Male", 62, 3));

        bigCars.add(new BigCar("Red", "Torchy Firetruck", "Male", 89, 4));
        bigCars.add(new BigCar("Green", "Volkswagen T1", "Male", 93, 4));
        bigCars.add(new BigCar("Khaki", "Willys MB", "Male", 84, 4));

        dolls.add(new Doll("flesh color", "Winx", "Female", 150, 3));
        dolls.add(new Doll("flesh color", "Monster high", "Female", 143, 3));
        dolls.add(new Doll("flesh color", "Barbie", "Female", 167, 4));

        balls.add(new Ball("White", "Ball for soccer", "Universal", 100, 4));
        balls.add(new Ball("Blue", "Ball for swimming", "Universal", 123, 3));
        balls.add(new Ball("Green", "Ball for tennis", "Universal", 60, 5));

        cubes.add(new Cube("Multi-colored", "Rubik's", "Universal", 170, 5));
        cubes.add(new Cube("Colored", "Cubes", "Universal", 50, 4));
        cubes.add(new Cube("Colored with letters", "Cubes", "Universal", 90, 3));





        SmallCar[] arrSmallCars = new SmallCar[smallCars.size()];
        MediumCar[] arrMediumCars = new MediumCar[mediumCars.size()];
        BigCar[] arrBigCars = new BigCar[bigCars.size()];
        Doll[] arrDolls = new Doll[dolls.size()];
        Ball[] arrBalls = new Ball[balls.size()];
        Cube[] arrCubes = new Cube[cubes.size()];
        arrSmallCars = smallCars.toArray(arrSmallCars);
        arrMediumCars = mediumCars.toArray(arrMediumCars);
        arrBigCars = bigCars.toArray(arrBigCars);
        arrDolls = dolls.toArray(arrDolls);
        arrBalls = balls.toArray(arrBalls);
        arrCubes = cubes.toArray(arrCubes);

        Operation operation = new Operation();
        operation.loadRoom(arrSmallCars , arrMediumCars, arrBigCars, arrBalls, arrDolls, arrCubes, 1500);
        operation.printLoad();
        operation.getLoad().sort(new ComparatorByPrice());
        System.out.println("\n\n\n\n");

        operation.printLoad();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Min price: ");
            double minPrice = scanner.nextDouble();
            System.out.println("Max price: ");
            double maxPrice = scanner.nextDouble();
            operation.finderGivenRange(minPrice, maxPrice).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Wrong input, input must be number, fractional part must be entered after ','");
        }

    }
}
