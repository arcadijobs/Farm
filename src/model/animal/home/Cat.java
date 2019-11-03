package model.animal.home;

public class Cat extends HomeAnimal {

  public Cat(String name, int weight, int speed, int hp) {
    super(name, weight, speed, hp, 0);
    this.canBeEaten = false;
    this.canProduceResource = false;
  }
}
