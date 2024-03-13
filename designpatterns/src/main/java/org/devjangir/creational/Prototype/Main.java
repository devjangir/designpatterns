package org.devjangir.creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun("AK-47", 100, 1000);
        Missile missile = new Missile("Tomahawk", 1000, 10000);
        Gun gunCopy = (Gun) gun.copy();
        gunCopy.setPosition(200);
        System.out.println(gun.getPosition());
        System.out.println(gunCopy.getPosition());
        System.out.println(gun.getName());
        System.out.println(gunCopy.getName());
    }
}
