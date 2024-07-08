package animals;

//import java.util.ArrayList;

public class AnimalList {
    private AnimalListItem head;

    public void add(Animal animal) {
        AnimalListItem item = new AnimalListItem(animal);
        if (head == null) {
            head = item;
        } else {
            AnimalListItem temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(item);
        }
    }

    public AnimalListItem getHead() {
        return head;
    }

    @Override
    public String toString() {
//        ArrayList<AnimalListItem> animals = new ArrayList<>();
        AnimalListItem temp = head;
        StringBuilder stringBuilder = new StringBuilder();

        while (temp.getNext() != null) {
//            animals.add(temp);
            stringBuilder.append(temp.getValue().toString());
            stringBuilder.append(" -> ");
            temp = temp.getNext();
        }
//        animals.add(temp);
        stringBuilder.append(temp.getValue().toString());

        return "AnimalList{" +
                stringBuilder +
        // animals.toString() +
                '}';
    }
}
