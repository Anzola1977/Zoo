public class Animal {
    String name;
    Boolean isVegetarian;
    int wight;

    public Animal(String name, Boolean isVegetarian, int wight) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.wight = wight;
    }

    public void print() {
        System.out.println( "I am a animal");
    }



   /* public void print() {
        System.out.println("I am a ");
    }*/
}
