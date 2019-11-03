package model.farm;

import Farm.model.animal.home.HomeAnimal;

public class Farm {
    private Farmer farmer;
    private HomeAnimal[] homeAnimals;

    public void addHomeAnimal(HomeAnimal homeAnimals) {
        // TODO: 04.11.19
    }

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
}
