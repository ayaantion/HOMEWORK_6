package com.company;

public class Main {

    public static void main(String[] args) {
        Boss blacksmith = new Boss(999, 98, new Weapon("AWP"));
        System.out.println(blacksmith.printInfo());

        Skeleton skeleton = new Skeleton(999, 76, new Weapon("USP-S"), 12);
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton(999, 45, new Weapon("AK-47"), 19);
        System.out.println(skeleton1.printInfo());
    }
}
