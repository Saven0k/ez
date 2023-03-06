package Comporator;
import java.util.Comparator;

import Comporator.*;


public class SnakeComporator<Snake> implements Comparator<Snake> {
    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }

}
