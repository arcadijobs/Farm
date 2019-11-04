package model.animal.home;

abstract public class HomeAnimal {
    private String name;
    private int weight;
    private int speed;
    private int hp;
    private int resource;

    boolean canBeEaten = true;
    boolean canProduceResource = true;
    boolean isAttacked = false;


    public HomeAnimal(String name, int weight, int speed, int hp, int resource) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.hp = hp;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public void setCanBeEaten(boolean canBeEaten) {
        this.canBeEaten = canBeEaten;
    }

    public boolean canProduceResource() {
        return canProduceResource;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public boolean isAttacked() {
        return isAttacked;
    }

    public abstract void setAttacked(boolean attacked);

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
