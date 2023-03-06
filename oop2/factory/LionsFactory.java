import java.util.ArrayList;
import java.util.Random;


import java.util.ArrayList;

public class LionsFactory {

    static public ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < 5; i++) {
            Lion lion = new Lion(new Random().nextInt(10), 8, 900, 4);
            lionInCage.add(lion);
        }
        return lionInCage;
    }

}
