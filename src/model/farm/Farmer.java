package model.farm;

public class Farmer {
    private final int START_RESOURCE_COUNT = 3;

    private String name;
    private int resources = START_RESOURCE_COUNT;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void collectResusrses() {
        // TODO: 04.11.19
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