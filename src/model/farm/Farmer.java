package model.farm;

import model.animal.home.HomeAnimal;

public class Farmer {
    private final int START_RESOURCE_COUNT = 3;
    private final int SINGLE_DAY_USED_RESOURCE_COUNT = 3;

    private String name;
    private int resources = START_RESOURCE_COUNT;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getResources() {
        return resources;
    }

    public void useResources(){
        this.resources -= SINGLE_DAY_USED_RESOURCE_COUNT;
    }

    public void setName(String name) {
        this.name = name;
    }

  public void collectResources(HomeAnimal[] homeAnimals) {
    for (HomeAnimal animal : homeAnimals) {
        if(animal.canProduceResource()){
            this.resources += animal.getResource();
        }
    }
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