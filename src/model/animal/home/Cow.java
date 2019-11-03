package model.animal.home;

public class Cow extends HomeAnimal {

    public Cow(String name, int weight, int speed, int hp, int resource) {
        super(name, weight, speed, hp, resource);
        canBeEaten = false;
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public void setCanBeEaten(boolean canBeEaten) {
        this.canBeEaten = canBeEaten;
    }

}
