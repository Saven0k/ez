import java.util.List;

public interface AnimalCage<T extends Animal, Animal> {
    public abstract void addAnimalInCage(T animal);

    public abstract String getFeedToCage(int countPiecesOfMeat);

    public abstract String ClearCage(int levelDirty);

    public abstract T getRandomAnimal();

    public int countAnimals();
    T takeOffAnimal();

    // public void sortByAge();

}
