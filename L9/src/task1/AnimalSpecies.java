package task1;

public enum AnimalSpecies {
    BIRD("Seeds and insects", 50),
    AMPHIBIAN("Insects and worms", 30),
    REPTILE("Insects and small animals", 40),
    MAMMAL("Grass, fruits, and meat", 100),
    MOLLUSK("Algae and plankton", 20),
    INSECT("Nectar, pollen, and other insects", 25);

    private String typicalFood;
    private int averageCostPerMonth;

    AnimalSpecies(String typicalFood, int averageCostPerMonth) {
        this.typicalFood = typicalFood;
        this.averageCostPerMonth = averageCostPerMonth;
    }

    public String getTypicalFood() {
        return typicalFood;
    }

    public int getAverageCostPerMonth() {
        return averageCostPerMonth;
    }
}
