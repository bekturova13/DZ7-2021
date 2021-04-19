package com.company;

public class Magic extends Hero{

    @Override
    public void applySuperAbility(String superAbility) {
        super.applySuperAbility(superAbility);
        System.out.println("Magic used Magical SuperAbility");
    }
}
