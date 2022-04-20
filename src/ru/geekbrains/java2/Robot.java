package ru.geekbrains.java2;

public class Robot implements Runable, Jumpable {
    public void run(Treadmill treadmill){
        System.out.println("Robot run");
    }

    public void jump(Wall wall){
        System.out.println("Robot jump");
    }
}
