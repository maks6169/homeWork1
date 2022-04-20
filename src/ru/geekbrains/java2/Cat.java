package ru.geekbrains.java2;

public class Cat implements Runable, Jumpable {
    private String name;
    private int maxLength;
    private int maxHeight;

    public void run(Treadmill treadmill) {
        if (maxLength >= treadmill.getTreadmillDistance())
            System.out.printf("Cat %s run on %d meters\n", name, treadmill.getTreadmillDistance());
        else
            System.out.printf("Cat %s cant run %d meters\n", name, treadmill.getTreadmillDistance());
    }

    public void jump(Wall wall) {
        if (maxHeight >= wall.getWallHeight()) {
            System.out.printf("Cat %s jump on %d meters\n", name, wall.getWallHeight());
        } else System.out.printf("Cat %s cant jump on %d meters\n", name, wall.getWallHeight());
    }

    public Cat(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }
}
