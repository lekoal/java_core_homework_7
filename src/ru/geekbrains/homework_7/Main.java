package ru.geekbrains.homework_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(40);
        plate.info();
        Scanner scan = new Scanner(System.in);
        Cat[] catArr = new Cat[6];
        catArr[0] = new Cat("Barsik", 5);
        catArr[1] = new Cat("Pushok", 8);
        catArr[2] = new Cat("Belyash", 7);
        catArr[3] = new Cat("Chernysh", 6);
        catArr[4] = new Cat("Simon", 12);
        catArr[5] = new Cat("Tom", 4);

        for (int i = 0; i < catArr.length; i++) {
            catArr[i].eat(plate);
            plate.info();
            catArr[i].info();
        }
        System.out.println("Do you wan to add food in plate? 1 - yes, 2 - no");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Choose quantity of food");
                int foodQuantity = scan.nextInt();
                plate.increaseFood(foodQuantity); // Добавление еды в тарелку
                plate.info();
            case 2: break;
        }


    }
}
