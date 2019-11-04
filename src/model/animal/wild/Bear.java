package model.animal.wild;

public class Bear extends WildAnimal {

    public Bear(int weight, int speed, int hp, int damage) {
        super(weight, speed, hp, damage);
        this.setName("Медведь");
    }
}
