package ru.geekbrains.java2;

public class Cat implements Runable, Jumpable {
    public void run(Treadmill treadmill){
        System.out.println("Cat run");
    }
    public void jump(Wall wall){
        System.out.println("Cat jump");
    }
}
