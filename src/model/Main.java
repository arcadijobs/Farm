package model;

import model.animal.home.*;
import model.animal.wild.Bear;
import model.animal.wild.Fox;
import model.animal.wild.WildAnimal;
import model.animal.wild.Wolf;
import model.farm.Farm;
import model.farm.Farmer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Random random = new Random();

    Farm farm = new Farm();
    Farmer farmer = new Farmer("Илья");
    HomeAnimal[] homeAnimals = new HomeAnimal[4];
    farm.setHomeAnimals(homeAnimals);
    Cat boris = new Cat("Boris", 6, 30, 10);
    Cow mumu = new Cow("Mumu", 60, 23, 50, 5);
    Chicken wuck = new Chicken("Wuck", 1, 15, 1, 2);
    Rabbit rogger = new Rabbit("Rogger", 7, 40, 5);

    Wolf wolf = new Wolf(20, 50, 10, 40);
    Fox fox = new Fox(10, 40, 5, 20);
    Bear bear = new Bear(100, 30, 50, 70);
    WildAnimal[] wildAnimals = new WildAnimal[3];
    wildAnimals[0] = wolf;
    wildAnimals[1] = fox;
    wildAnimals[2] = bear;

    farm.addHomeAnimal(boris);
    farm.addHomeAnimal(mumu);
    farm.addHomeAnimal(wuck);
    farm.addHomeAnimal(rogger);

    int aliveHomeAnimalsCount = homeAnimals.length;

    while (farmer.isAlive()) {
      // TODO: 11/4/2019
      farmer.collectResources(homeAnimals);
      TimeUnit.SECONDS.sleep(1);
      if (aliveHomeAnimalsCount > 0) {
        int target = random.nextInt(aliveHomeAnimalsCount);
        WildAnimal hunterAnimal = wildAnimals[random.nextInt(wildAnimals.length)];
        HomeAnimal targetHomeAnimal = homeAnimals[target];
        if (targetHomeAnimal != null && hunterAnimal.getDamage() > targetHomeAnimal.getHp()) {
          hunterAnimal.attack(targetHomeAnimal);
          System.out.println("Идет погоня");

          if (random.nextInt(100) < targetHomeAnimal.getSpeed() / hunterAnimal.getSpeed() * 100) {
            System.out.println(targetHomeAnimal.getName() + " убежал(а)!!!");
          } else {
            if(targetHomeAnimal.getName().equalsIgnoreCase("Rogger")){
              System.out.println("Rogger, БЛЯТЬ, НЕ УБЕЖАЛ !!!");
            }

            System.out.println(
                hunterAnimal.getName() + " догнал и съел " + targetHomeAnimal.getName() + "!!!");
            homeAnimals[target] = null;
            aliveHomeAnimalsCount--;

            homeAnimals = trimArrayFromNull(homeAnimals, aliveHomeAnimalsCount);

            if (homeAnimals.length > 0) {
              System.out.println("В живых:");
              for (HomeAnimal homeAnimal : homeAnimals) {
                if (homeAnimal != null) {
                  System.out.println("     " + homeAnimal.toString());
                }
              }
            } else {
              System.out.println("Домашних животных не осталось!!!");
            }
          }
        }
      } else {
        System.out.println("Сегодня никто не напал");
      }
      farmer.useResources();
    }
  }

  private static HomeAnimal[] trimArrayFromNull(HomeAnimal[] homeAnimals, int aliveAnimalsCount) {
    HomeAnimal[] newHomeAnimalsArray = new HomeAnimal[aliveAnimalsCount];
    for (int i = 0, j = 0; i < homeAnimals.length; i++) {
      if (homeAnimals[i] != null) {
        newHomeAnimalsArray[j] = homeAnimals[i];
        j++;
      }
    }
    return newHomeAnimalsArray;
  }
}
