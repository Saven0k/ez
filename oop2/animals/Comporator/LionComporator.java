package Comporator;

import java.util.Comparator;

public class LionComporator<Lion> implements Comparator<Lion> {
    @Override
    public int compare(Lion o1, Lion o2) {
        if (( o1).getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }


}
