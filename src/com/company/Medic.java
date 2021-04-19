package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String superAbility) {
        super.applySuperAbility(superAbility);
        System.out.println("Medic used healing Super ability");
    }
}
