public class Dog extends Animal{

    public Dog(String name, Boolean isVegetarian, int wight) {
        super(name, isVegetarian, wight);
    }

    @Override
    public void print() {
        System.out.println("I am a dog");
    }

    /*   @Override
    public void print() {
        System.out.println("I am a dog!");
        super.print();
    }*/
}
