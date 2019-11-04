package model.farm;

import model.animal.home.HomeAnimal;

public class Farmer {
    private final int START_RESOURCE_COUNT = 3;
    private final int SINGLE_DAY_USED_RESOURCE_COUNT = 3;

    private String name;
    private int resources = START_RESOURCE_COUNT;
    private boolean isAlive = true;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResources() {
        return resources;
    }

    public void useResources(){
        this.resources -= SINGLE_DAY_USED_RESOURCE_COUNT;
        if (this.resources >= 0) {
          System.out.println(this.name + " поел " + this.resources);
        } else {
          isAlive = false;
          System.out.println("Еды не осталось и " + this.name + " умер от голода");
        }
    }

  public void collectResources(HomeAnimal[] homeAnimals) {
    for (HomeAnimal animal : homeAnimals) {
        if(animal != null && animal.canProduceResource()){
            this.resources += animal.getResource();
        }
    }
    System.out.println(this.name + " собрал продукты " + this.resources);
  }

    public boolean isAlive() {
        return isAlive;
    }

    public static void toScareWildAnimal() {
        // TODO: 04.11.19
    }

    public static void eatHomeAnimal() {
        // TODO: 04.11.19
    }

    public static void feedAnimal() {
        // TODO: 04.11.19
    }
}