package com.company;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility(String superAbility) {
        super.applySuperAbility(superAbility);
        System.out.println("Warrior used Physical Super Ability");
    }
}
