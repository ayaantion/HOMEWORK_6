package com.company;

public class Skeleton extends Boss{
    private int arrowsNumber;

    public int getArrowsNumber() {
        return arrowsNumber;
    }

    public void setArrowsNumber(int arrowsNumber) {
        this.arrowsNumber = arrowsNumber;
    }

    public Skeleton(int health, int damage, Weapon weapon, int arrowsNumber) {
        super(health, damage, weapon);
        this.arrowsNumber = arrowsNumber;
    }

    public String printInfo() {
        return super.printInfo() + "\nArrows number - " + arrowsNumber;
    }
}
