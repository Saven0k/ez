import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
// import oop2;    Не работают данные импорты не знаю почему
import java.util.Random;

// import Comporator.WolfComporator;

public class WolfCage<Wolf> implements AnimalCage<Wolf, Wolf>, Iterable<Wolf> {

    private List<Wolf> wolfs1;
    private int levelDirty;
    private ArrayList wolfs;

    public WolfCage() {
        wolfs = new ArrayList<Wolf>();
    }

    public WolfCage(List<Wolf> wolfs) {
        this.wolfs1 = wolfs;
    }

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public int countAnimals() {
        return wolfs.size();
    }

    @Override
    public String ClearCage(int levelDirty) {
        levelDirty = 0;
        return "Клетка отчищена";
    }

    @Override
    public void addAnimalInCage(Wolf animal) {
        wolfs.add((Wolf) animal);
    }

    @Override
    public Iterator<Wolf> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    public Wolf takeOffAnimal() {
        if (wolfs == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(wolfs.size());
            return (Wolf) wolfs.remove(i);
        }
    }

    @Override
    public Wolf getRandomAnimal() {
        for (int i = 0; i < 1; i++) {
            return (Wolf) wolfs.get(0);
        }
        return null;
    }

    @Override
    public String getFeedToCage(int countPiecesOfMeat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFeedToCage'");
    }

}
