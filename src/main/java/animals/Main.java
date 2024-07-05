package animals;

public class Main {
    public static void main(String[] args) {
        Animal zebra = new Animal("Leo", "Zebra");
        Animal giraffe = new Animal("Priyanka", "Giraffe");
        Animal cat = new Animal("Chloe", "Cat");
        Animal dog = new Animal("Herold", "Dog");

        AnimalList animalList = new AnimalList();
        animalList.add(zebra);
        animalList.add(giraffe);
        animalList.add(cat);
        animalList.add(dog);
        System.out.println(animalList);

    }
}
