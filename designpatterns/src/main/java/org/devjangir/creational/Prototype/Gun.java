package org.devjangir.creational.Prototype;

public class Gun extends Weapon {
    public Gun(String name, int damage, int range) {
        super(name, damage, range);
    }

    public Gun(Gun gun) {
        super(gun);
    }

    @Override
    public Weapon copy() {
        Gun gun = new Gun(this);
        gun.setPosition(this.getPosition());
        return gun;
    }
}
