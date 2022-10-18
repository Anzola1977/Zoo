public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.print();
        zoo.change(new Reptile("Cobra", false, 3, true), 0);
        zoo.print();
    }
}