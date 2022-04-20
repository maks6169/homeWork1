package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        treadmill.setTreadmillDistance(6000);
        wall.setWallHeight(6);
        Human human = new Human("Jonh",6,5768);
        human.jump(wall);
        human.run(treadmill);

    }
}
