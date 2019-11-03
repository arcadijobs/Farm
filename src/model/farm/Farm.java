package model.farm;

import model.animal.home.HomeAnimal;

public class Farm {
    private Farmer farmer;
    private HomeAnimal[] homeAnimals;

    public HomeAnimal getRandomHomeAnimal() {
        // TODO: 04.11.19
        return null;
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
}
