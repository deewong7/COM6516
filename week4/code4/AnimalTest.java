import java.util.ArrayList;
import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        // Animal[] animals = {new Cow(), new Pig()};
        Animal animal = new Cow();

        animal.talk();
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Animal[]{new Cow(), new Pig()}));

        animals.add(new Sheep());
        // for (int i = 0; i < animals.length; i++) {
        for (int i = 0; i < animals.size(); i++) {
            // animals[i].talk();
            animals.get(i).talk();
        }
    }
}
