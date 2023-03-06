package Comporator;

import java.util.Comparator;


public class WolfComporator<Wolf> implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
