package model.farm;

import model.animal.home.HomeAnimal;

import java.util.Random;

public class Farm {
    private Farmer farmer;
    private HomeAnimal[] homeAnimals;

    public HomeAnimal getRandomHomeAnimal() {
        Random random = new Random();

        HomeAnimal[] newHomeAnimalsArray = trimArrayFromNull(this.getHomeAnimals());
        int target = random.nextInt(newHomeAnimalsArray.length);

        this.homeAnimals = newHomeAnimalsArray;

        return newHomeAnimalsArray[target];
    }

    public void trimDeathHomeAnimals(HomeAnimal deadHomeAnimal){
        for (int i = 0; i < this.homeAnimals.length; i++) {
            if(this.homeAnimals[i].getName().equalsIgnoreCase(deadHomeAnimal.getName())){
                this.homeAnimals[i] = null;
            }
        }
        this.homeAnimals = trimArrayFromNull(this.homeAnimals);
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public HomeAnimal[] getHomeAnimals() {
        return homeAnimals;
    }

    public void setHomeAnimals(HomeAnimal[] homeAnimals) {
        this.homeAnimals = homeAnimals;
    }

  public void addHomeAnimal(HomeAnimal homeAnimal) {
    for (int i = 0; i < homeAnimals.length; i++) {
      if (this.homeAnimals[i] == null) {
        this.homeAnimals[i] = homeAnimal;
        break;
      }
    }
  }

  public boolean hasAliveHomeAnimal(){
        return this.homeAnimals.length > 0;
  }
    private static HomeAnimal[] trimArrayFromNull(HomeAnimal[] homeAnimals) {

        int aliveHomeAnimalsCount = 0;
        for (HomeAnimal animal : homeAnimals) {
            if(animal != null){
                aliveHomeAnimalsCount++;
            }
        }

        HomeAnimal[] newHomeAnimalsArray = new HomeAnimal[aliveHomeAnimalsCount];

        for (int i = 0, j = 0; i < homeAnimals.length; i++) {
            if (homeAnimals[i] != null) {
                newHomeAnimalsArray[j] = homeAnimals[i];
                j++;
            }
        }
        return newHomeAnimalsArray;
    }
}
