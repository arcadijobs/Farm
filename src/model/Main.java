package model;

import model.animal.home.Cat;
import model.animal.home.Chicken;
import model.animal.home.Cow;
import model.animal.home.Rabbit;
import model.farm.Farm;
import model.farm.Farmer;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm();
    Farmer farmer = new Farmer("Ilia");
    Cat boris = new Cat("Boris", 6, 4, 10);
    Cow mumu = new Cow("Mumu", 60, 23, 50, 5);
    Chicken wuck = new Chicken("Wuck", 1, 15, 1, 2);
    Rabbit rogger = new Rabbit("Rogger", 7, 70, 5);

    farm.addHomeAnimal(boris);
    farm.addHomeAnimal(mumu);
    farm.addHomeAnimal(wuck);
    farm.addHomeAnimal(rogger);

    while (farmer.getResources() != 0) {
      // TODO: 11/4/2019
      farmer.collectResources(farm.getHomeAnimals());
      //...
      farmer.useResources();
    }
  }
}
