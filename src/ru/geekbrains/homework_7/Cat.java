package ru.geekbrains.homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false; // Поле сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) fullness = true;
        else System.out.printf("%s appetite: %s%n", name, appetite);
    }

    public void info() {
        if (fullness) System.out.printf("%s is full%n", name);
        else System.out.printf("%s is hungry%n", name);
    }
}
