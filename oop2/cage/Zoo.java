import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    private WolfCage WolfCage;

    private LionCage LionCage;

    private SnakeCage SnakeCage;

    public Zoo(WolfCage WC, LionCage LC, SnakeCage SC) {
        this.WolfCage = WC;
        this.LionCage = LC;
        this.SnakeCage = SC;
    }

    public WolfCage getWolfCage() {
        return WolfCage;
    }

    public void setWolfCage(WolfCage wolfCage) {
        this.WolfCage = wolfCage;
    }


    public LionCage getLionCage() {
        return LionCage;
    }

    public void setLionCage(LionCage LionCage) {
        this.LionCage = LionCage;
    }

    public SnakeCage getSnakeCage() {
        return SnakeCage;
    }

    public void setSnakeCage(SnakeCage SnakeCage) {
        this.SnakeCage = SnakeCage;
    }

    public Lion DeleteLionOutCage() {
        
        return (Lion) this.LionCage.getRandomAnimal();
    }

    public Wolf DeleteWolfOutCage() {
        return (Wolf) this.WolfCage.getRandomAnimal();
    }

    public Snake DeleteSnakeOutCage() {
        return (Snake) this.SnakeCage.getRandomAnimal();
    }

    public void CreateLionOutCage(Lion lion) {
        Lion lion1 = new Lion(lion.getManeVolume(), lion.getAge(), lion.getWeight(), lion.getKolLimbs());
        this.LionCage.addAnimalInCage(lion1);
    }

    public void CreateWolfOutCage(Wolf wolf) {
        Wolf wolf1 = new Wolf(wolf.getLengthTail(), wolf.getAge(), wolf.getWeight(), wolf.getKolLimbs());
        this.WolfCage.addAnimalInCage(wolf1);
    }

    public void CreateSnakeOutCage(Snake snake) {
        Snake snake1 = new Snake(snake.getLenBody(), snake.getAge(), snake.getKolLimbs(), snake.getWeight());
        this.SnakeCage.addAnimalInCage(snake1);
    }
 
    

    public String toString() {
        int wolfCount = 0;
        int snakeCount = 0;
        int lionCount = 0;
        if (WolfCage != null) {
            wolfCount = WolfCage.countAnimals();
        }
        if (SnakeCage != null) {
            snakeCount = SnakeCage.countAnimals();
        }
        if (LionCage != null) {
            lionCount = LionCage.countAnimals();
        }
        return "Zoo{" +
                "wolves=" + wolfCount +
                ", lions=" + lionCount +
                ", snakes=" + snakeCount +
                '}';
    }
}
