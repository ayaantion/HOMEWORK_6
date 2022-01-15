package com.company;

public class Boss extends GameEntity{
    Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public String printInfo(){
        System.out.println("");
        return "Health - " + this.getHealth() + ",\nDamage - " + this.getDamage() + "\nWeapon - " + this.weapon.getWeaponName();
    }
}
