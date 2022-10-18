public class Cat extends Animal {

    public Cat(String name, Boolean isVegetarian, int wight) {
        super(name, isVegetarian, wight);
    }

    @Override
    public void print() {
        System.out.println("I am a cat");;
    }
/*   @Override
    public void print() {
        System.out.println(super.print() + " cat!");
        ;
    }*/
}
