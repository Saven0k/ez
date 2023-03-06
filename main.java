import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class main {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Lion lion1 = new Lion(5, 7, 1000, 4);
        Lion lion2 = new Lion(5, 5, 1566, 4);
        Lion lion3 = new Lion(1, 2, 123, 4);

        LionCage lc = new LionCage();
        lc.addAnimalInCage(lion1);
        lc.addAnimalInCage(lion2);
        lc.addAnimalInCage(lion3);

        Wolf wolf1 = new Wolf(5, 5, 1100, 4);
        Wolf wolf2 = new Wolf(5, 15, 123, 4);
        Wolf wolf3 = new Wolf(5, 25, 500, 4);
        WolfCage wc = new WolfCage();
        wc.addAnimalInCage(wolf1);
        wc.addAnimalInCage(wolf2);
        wc.addAnimalInCage(wolf3);

        Snake snake1 = new Snake(5, 5, 5, 5);
        Snake snake2 = new Snake(6, 6, 6, 6);
        Snake snake3 = new Snake(7, 7, 7, 7);
        SnakeCage sc = new SnakeCage();
        sc.addAnimalInCage(snake1);
        sc.addAnimalInCage(snake2);
        sc.addAnimalInCage(snake3);

        String menu = ("1 - Добавить льва \n"
                + "2 - Удалить льва\n"
                + "3 - Добавить волка\n"
                + "4 - Удалить волка\n"
                + "5 - Добавить змею\n"
                + "6 - Удалить змею\n"
                + "7 - Просмотр зоопарка\n"
                + "0 - Выйти\n"
                + ": ");

        Zoo zoo1 = new Zoo(wc, lc, sc);

        WorkMenu wM = new WorkMenu(zoo1);
        wM.workToMain(zoo1, menu);

    }

}
