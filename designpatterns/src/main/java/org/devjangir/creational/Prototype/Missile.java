package org.devjangir.creational.Prototype;

public class Missile extends Weapon {
    public Missile(String name, int damage, int range) {
        super(name, damage, range);
    }

    public Missile(Missile missile) {
        super(missile);
    }

    @Override
    public Missile copy() {
        Missile missile = new Missile(this);
        missile.setPosition(this.getPosition());
        return missile;
    }
}
