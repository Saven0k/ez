public class Wolf extends Animal {

    private double lenthTail;
    protected static final String TYPE = "Wolf";
    private static final float MAX_WEIGHT = 100;

    public Wolf(int lenthTail, int age, int weight, int kolLimbs) {
        super(age, weight, kolLimbs);
        this.lenthTail = lenthTail;
    }

    public int getLengthTail() {
        return (int) lenthTail;
    }

    public void setLengthTail(int lenthTail) {
        this.lenthTail = lenthTail;
    }

    public int getAge() {
        return age;
    }

    
    public int getWeight() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCollimbs() {
        return age;
    }

    public void setCollimbs(int kolimbs) {
        this.kolLimbs = kolimbs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public float getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return " Wolf{" +
                " age = " + this.age +
                '}';
    }
}
