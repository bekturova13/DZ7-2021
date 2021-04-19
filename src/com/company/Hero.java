package com.company;

public abstract class Hero implements HavingSuperAbility {
    int heroesHealth;
    int heroesDamage;
    String superAbility;

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    @Override
    public void applySuperAbility(String superAbility) {

    }
}
