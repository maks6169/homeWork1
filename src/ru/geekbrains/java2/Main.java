package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {
        Human[] humans = {new Human("Jonh", 3, 2500),
                new Human("Bob", 5, 2345)
        };
        Cat[] cats = {new Cat("Barsik", 5, 342),
                new Cat("Busya", 7, 25),
                new Cat("Kisa", 1, 50000)};
        Robot[] robots = {
                new Robot("Kiborg", 1000, 5000),
                new Robot("Terminator", 0, 9999999)
        };
        Treadmill[] treadmills = {new Treadmill(56),
                new Treadmill(6000),
                new Treadmill(80000)};
        Wall[] walls = {new Wall(1),
                new Wall(5),
                new Wall(500)};

        for (Robot robot : robots) {
            for (int i = 0; i < treadmills.length; i++) {
                robot.run(treadmills[i]);
                if (robot.getMaxLength() < treadmills[i].getTreadmillDistance()) break;
            }
            for (int i = 0; i < walls.length; i++) {
                robot.jump(walls[i]);
                if (robot.getMaxHeight() < walls[i].getWallHeight()) break;
            }
        }
        for (Cat cat : cats) {
            for (int i = 0; i < treadmills.length; i++) {
                cat.run(treadmills[i]);
                if (cat.getMaxLength() < treadmills[i].getTreadmillDistance()) break;
            }
            for (int i = 0; i < walls.length; i++) {
                cat.jump(walls[i]);
                if (cat.getMaxHeight() < walls[i].getWallHeight()) break;
            }
        }
        for (Human human : humans) {
            for (int i = 0; i < treadmills.length; i++) {
                human.run(treadmills[i]);
                if (human.getMaxLength() < treadmills[i].getTreadmillDistance()) break;
            }
            for (int i = 0; i < walls.length; i++) {
                human.jump(walls[i]);
                if (human.getMaxHeight() < walls[i].getWallHeight()) break;
            }
        }
    }
}
