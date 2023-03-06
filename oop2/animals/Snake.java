public class Snake extends Animal {

    private double lenBody;
    private static final float MAX_WEIGHT = 100;
    protected static final String TYPE = "Shake";

    public Snake(int lenBody, int age, int kolLimbs, int weight) {
        super(age, weight, kolLimbs);
        this.lenBody = lenBody;
    }

    public int getLenBody() {
        return (int) lenBody;
    }

    public void setLenBody(int lenBOdy) {
        this.lenBody = lenBOdy;
    }

    public int getCollimbs(){
        return age;
    }
    public void setCollimbs(int kolimbs){
        this.kolLimbs = kolimbs;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight(){
        return age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public float getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return " Snake{" +
                " age = " + this.age +
                '}';
    }
}
