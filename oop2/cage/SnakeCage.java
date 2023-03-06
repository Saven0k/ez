import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

// import oop2.animals.*;

public class SnakeCage<Snake> implements AnimalCage<Snake, Snake> {

    private int levelDirty;
    private List snakes;

    public SnakeCage() {
        snakes = new ArrayList<Snake>();
    }

    public SnakeCage(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public String ClearCage(int levelDirty) {
        levelDirty = 0;
        return "Клетка отчищена";
    }

    @Override
    public void addAnimalInCage(Snake animal) {
        this.snakes.add(animal);
    }

    @Override
    public String getFeedToCage(int countPiecesOfMeat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFeedToCage'");
    }

    @Override
    public Snake getRandomAnimal() {
        for (int i = 0; i < 1; i++) {
            return (Snake) snakes.get(0);
        }
        return null;
    }

    @Override
    public int countAnimals() {
        return snakes.size();
    }
    
    public Snake takeOffAnimal() {
        if (snakes == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(snakes.size());
            return (Snake) snakes.remove(i);
        }
    }
}