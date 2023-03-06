import Comporator.AnimalComporator;

import java.util.Collections;
import java.util.List;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimal(List<T> animalList) {
        Collections.sort(animalList, new AnimalComporator());
        return animalList;
    }
}
