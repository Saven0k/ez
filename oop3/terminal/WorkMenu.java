import java.util.Scanner;

public class WorkMenu {
    private Zoo zoo1;
    private LionCage lc;
    private WolfCage wc;
    private SnakeCage sc;

    public WorkMenu(Zoo zoo){
            this.zoo1 = zoo;
            this.lc = zoo1.getLionCage();
            this.wc = zoo1.getWolfCage();
            this.sc = zoo1.getSnakeCage();
        }

    public void workToMain(Zoo zoo1, String menu){

        Scanner iScanner = new Scanner(System.in);
        while(true){
            PrintMenu pM = new PrintMenu(menu);
            pM.returnVariant();
            if (pM.returnVariant() == 1) {
                System.out.println("Введите длинну гривы ");
                int maneVolume = iScanner.nextInt();
                System.out.println("Введите возраст ");
                int age = iScanner.nextInt();
                System.out.println("Введите колличество конечностей ");
                int kolimbs = iScanner.nextInt();
                System.out.println("Введите вес ");
                int weight = iScanner.nextInt();
                Lion newLion = new Lion(maneVolume, age, kolimbs, weight);
                lc.addAnimalInCage(newLion);
                System.out.println("Животное добавлено!");
            } else if (pM.returnVariant() == 2) {
                lc.takeOffAnimal();
                System.out.println("Животное удалено!");

            } else if (pM.returnVariant() == 3) {
                System.out.println("Введите длинну хвоста ");
                int getLengthTail = iScanner.nextInt();
                System.out.println("Введите возраст ");
                int age = iScanner.nextInt();
                System.out.println("Введите колличество конечностей ");
                int kolimbs = iScanner.nextInt();
                System.out.println("Введите вес ");
                int weight = iScanner.nextInt();
                Wolf newWolf = new Wolf(getLengthTail, age, kolimbs, weight);
                wc.addAnimalInCage(newWolf);
                System.out.println("Животное добавлено!");

            } else if (pM.returnVariant() == 4) {
                wc.takeOffAnimal();
                System.out.println("Животное удалено!");

            } else if (pM.returnVariant() == 5) {
                System.out.println("Введите длинну тела ");
                int lenBOdy = iScanner.nextInt();
                System.out.println("Введите возраст ");
                int age = iScanner.nextInt();
                System.out.println("Введите колличество конечностей ");
                int kolimbs = iScanner.nextInt();
                System.out.println("Введите вес ");
                int weight = iScanner.nextInt();
                Snake newSnake = new Snake(lenBOdy, age, kolimbs, weight);
                sc.addAnimalInCage(newSnake);
                System.out.println("Животное добавлено!");

            } else if (pM.returnVariant() == 6) {
                sc.takeOffAnimal();

                System.out.println("Животное удалено!");

            } else if (pM.returnVariant() == 7) {
                System.out.println(zoo1);
            } else if (pM.returnVariant() == 0) {
                System.exit(0);
            }
        }
    }
}
