package model.animal.wild;

import model.animal.home.HomeAnimal;

abstract public class WildAnimal {
    private int weight;
    private int speed;
    private int hp;
    private int damage;
    private int attacksFailed;
    private String name;

    public WildAnimal(int weight, int speed, int hp, int damage) {
    this.weight = weight;
    this.speed = speed;
    this.hp = hp;
    this.damage = damage;
    }

    public void attack(HomeAnimal homeAnimal){
        System.out.println(this.getName() + " напал(а)");
        homeAnimal.setAttacked(true);
    };

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttacksFailed() {
        return attacksFailed;
    }

    public void setAttacksFailed(int attacksFailed) {
        this.attacksFailed = attacksFailed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", hp=" + hp +
                ", damage=" + damage +
                ", miss=" + attacksFailed +
                '}';
    }
}
