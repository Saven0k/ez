import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// import Comporator.LionComporator;
// import oop2\animals\Lion.java;
// import oop2\animals\Comporator\LionComporator.java;

public class LionCage<Lion> implements AnimalCage<Lion, Lion> {

    private int levelDirty;
    private List lions;

    public LionCage() {
        lions = new ArrayList<Lion>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public void sortlions() {
        Collections.sort(lions);
    }

    public List<Lion> getLions() {
        return lions;
    }

    // public void sortLionsByManeVolume() {
    // Collections.sort(lions, new LionComporator());
    // }

    @Override
    public String ClearCage(int levelDirty) {
        levelDirty = 0;
        return "Клетка отчищена";
    }

    @Override
    public void addAnimalInCage(Lion animal) {
        lions.add(animal);
    }

    // @Override
    // public String getFeedToCage(int countPiecesOfMeat) {
    // double PieceOfMetFOrOneLion = countPiecesOfMeat / (lions.size());
    // for (Lion an : lions) {
    // an = an.feed(10);
    // }
    // return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!";
    // }

    @Override
    public Lion getRandomAnimal() {
        for (int i = 0; i < 1; i++) {
            return (Lion) lions.get(0);
        }
        return null;
    }


    @Override
    public String toString() {
        return " LionCage{" +
                " lions = " + lions +
                '}';
    }

    @Override
    public String getFeedToCage(int countPiecesOfMeat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFeedToCage'");
    }

    @Override
    public int countAnimals() {
        return lions.size();
    }
    
    public Lion takeOffAnimal() {
        if (lions == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(lions.size());
            return (Lion) lions.remove(i);
        }
    }

    

}