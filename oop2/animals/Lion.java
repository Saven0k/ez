import java.util.jar.Attributes.Name;


public class Lion extends Animal implements Comparable<Lion> {

    private double maneVolume;

    protected static final String TYPE = "Lion";

    private static final float MAX_WEIGHT = 100;


    public Lion(int maneVolume, int age, int weight, int kolLimbs) {
        super(age, weight, kolLimbs);
        this.maneVolume = maneVolume;
    }



    public int getManeVolume() {
        return (int) maneVolume;
    }
    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public int getCollimbs(){
        return age;
    }
    public void setCollimbs(int kolimbs){
        this.kolLimbs = kolimbs;
    }

    

    @Override
    public float getMaxWeight() {
        return MAX_WEIGHT;
    }


    @Override
    public void feed(int foodWeight){
        if (getMaxWeight() >= (this.weight + foodWeight)) {
            this.weight += foodWeight;
        } else {
            System.out.println("'Max weight exceeeded'");
        }
    }

    
    @Override
    public String getType() {
        return TYPE;
    }


    @Override
    public int compareTo(Lion o) {
        if (this.age > o.getAge()) return 1;
        else if (this.age < o.getAge()) return -1;
        return 0;

    }



    // @Override
    // public int sortManeVolume(Lion o){
    //     if (this.age > o.getManeVolume()) return 1;
    //     else if(this.age < o.getManeVolume()) return -1;
    //     return 0;

    // }



    @Override
    public String toString() {
        return " Lion{" +
                " age = " + age +
                " maneVolume = " + maneVolume +
                '}';
    }
    
}
