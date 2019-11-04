package model.animal.home;

public class Cat extends HomeAnimal {

  public Cat(String name, int weight, int speed, int hp) {
    super(name, weight, speed, hp, 0);
    this.canBeEaten = false;
    this.canProduceResource = false;
  }

  @Override
  public void setAttacked(boolean attacked) {
    this.isAttacked = attacked;
    System.out.println(this.getName() + " увидел зверя и бежит от него");
  }
}
