package ru.geekbrains.homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food > n) { // Проверка на количество еды в миске
            food -= n;
            return true;
        } else {
            System.out.println("Not enough food in the plate");
        }
        return false;
    }

    public void increaseFood(int n) { // Метод добавления еды в тарелку
        if (n > 0) {
            food += n;
        } else System.out.println("Too low quantity of food");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}