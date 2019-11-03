package model.animal.home;

public class Chicken extends HomeAnimal {
    private int resource;

    public Chicken(String name, int weight, int speed, int hp) {
        super(name, weight, speed, hp);

    }
    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public void setCanBeEaten(boolean canBeEaten) {
        this.canBeEaten = canBeEaten;
    }
}
