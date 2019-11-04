package model.animal.home;

public class Rabbit extends HomeAnimal {

    public Rabbit(String name, int weight, int speed, int hp) {
        super(name, weight, speed, hp, 0);
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public void setCanBeEaten(boolean canBeEaten) {
        this.canBeEaten = canBeEaten;
    }

    @Override
    public void setAttacked(boolean attacked) {
        this.isAttacked = attacked;
        System.out.println(this.getName() + " увидел зверя и бежит от него");
    }
}
