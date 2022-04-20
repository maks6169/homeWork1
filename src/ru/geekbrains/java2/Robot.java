package ru.geekbrains.java2;

public class Robot implements Runable, Jumpable {
    private String name;
    private int maxLength;
    private int maxHeight;

    public void run(Treadmill treadmill) {
        if (maxLength >= treadmill.getTreadmillDistance()) {
            System.out.printf("Robot %s run on %d meters\n", name, treadmill.getTreadmillDistance());
        } else
            System.out.printf("Robot %s cant run %d meters\n", name, treadmill.getTreadmillDistance());
    }

    public void jump(Wall wall) {
        if (maxHeight >= wall.getWallHeight()) {
            System.out.printf("Robot %s jump on %d meters\n", name, wall.getWallHeight());
        } else System.out.printf("Robot %s cant jump on %d meters\n", name, wall.getWallHeight());
    }

    public Robot(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }
}
