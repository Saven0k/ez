import javax.crypto.AEADBadTagException;

public abstract class Animal{

    protected int age;
    protected double weight;
    protected int kolLimbs;

    public Animal(int age, int weight, int kolLimbs) {
        this.age = age;
        this.weight = weight;
        this.kolLimbs = kolLimbs;
    }

    public void feed(int foodWeight) {
        if (getMaxWeight() >= (this.weight + foodWeight)) {
            this.weight += foodWeight;
        } else {
            System.out.println("'Max weight exceeeded'");
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getWeight() {
        return (int) weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }



    public int getKolLimbs() {
        return kolLimbs;
    }
    public void setKolLimbs(int kolLimbs) {
        this.kolLimbs = kolLimbs;
    }

    public abstract String getType();

    public abstract float getMaxWeight();

}

