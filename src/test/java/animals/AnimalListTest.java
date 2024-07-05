package animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {
    @Test
    public void addTest_whenAddingFirstAnimal_thenHeadValueEqualsAnimal() {
        //GIVEN
        Animal giraffe = new Animal("Chiara", "Giraffe");

        //WHEN
        AnimalList animalList = new AnimalList();
        animalList.add(giraffe);
        Animal actual = animalList.getHead().getValue();

        //THEN
        assertEquals(giraffe, actual);
    }

    @Test
    public void addTest_whenAddingSecondAnimal_thenHeadNextEqualsAnimal() {
        //GIVEN
        Animal bear = new Animal("Eva", "Bear");

        //WHEN
        AnimalList animalList = new AnimalList();
        Animal giraffe = new Animal("Chiara", "Giraffe");
        animalList.add(giraffe);
        animalList.add(bear);
        Animal actual = animalList.getHead().getNext().getValue();

        //THEN
        assertEquals(bear, actual);

    }

    @Test
    public void addTest_whenAddingThirdAnimal_thenHeadNextNextEqualsAnimal() {
        //GIVEN
        Animal elephant = new Animal("Louka", "Elephant");

        //WHEN
        AnimalList animalList = new AnimalList();
        Animal giraffe = new Animal("Chiara", "Giraffe");
        Animal bear = new Animal("Eva", "Bear");
        animalList.add(giraffe);
        animalList.add(bear);
        animalList.add(elephant);
        Animal actual = animalList.getHead().getNext().getNext().getValue();

        //THEN
        assertEquals(elephant, actual);
    }

//    @Test
//    public void removeTest_whenRemovingFirstAnimal_thenHeadEqualsHeadNextAnimal() {
//
//    }

}
