package model.animal.wild;

public class Wolf extends WildAnimal {
    public Wolf(int weight, int speed, int hp, int damage) {
        super(weight, speed, hp, damage);
        this.setName("Волк");
    }
}
