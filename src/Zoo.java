public class Zoo {
    private Animal[] animals = new Animal[3];
    private String result;


    public Zoo() {
        animals[0] = new Dog("Sharik", false, 10);
        animals[1] = new Cat("Pups", true, 2);
        animals[2] = new Reptile("Snake", false, 3, false);
    }

    public void print() {
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for (Animal a : animals) {
            a.print();
        }
    }

    public void change(Animal a, int i) {
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }

}


