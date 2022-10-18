public class Reptile extends Animal {
    boolean isPoisonous;
    public Reptile(String name, Boolean isVegetarian, int wight, boolean isPoisonous) {
        super(name, isVegetarian, wight);
        this.isPoisonous = isPoisonous;
    }


    public void print() {
        if (isPoisonous) {
            System.out.println("I am a poisonous snake");
        } else {
            System.out.println("I am a snake");
        }

    /*  @Override
    public void print() {
        System.out.println("I am a reptile!");
        super.print();
    }*/
    }
}
