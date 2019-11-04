package model.animal.home;

public class Chicken extends HomeAnimal {

    public Chicken(String name, int weight, int speed, int hp, int resource) {
        super(name, weight, speed, hp, resource);

    }

    @Override
    public void setAttacked(boolean attacked) {
        this.isAttacked = attacked;
        System.out.println(this.getName() + " увидела зверя и бежит от него");
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public void setCanBeEaten(boolean canBeEaten) {
        this.canBeEaten = canBeEaten;
    }
}
