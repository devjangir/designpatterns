package org.devjangir.creational.Prototype;

public abstract class Weapon {
    private String name;
    private int damage;
    private int range;
    private int position;

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
        this.position = 0;
    }

    public Weapon(Weapon weapon) {
        this.name = weapon.name;
        this.damage = weapon.damage;
        this.range = weapon.range;
        this.position = weapon.position;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public abstract Weapon copy();
}

