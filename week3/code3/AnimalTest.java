abstract class Animal {
    // public void talk() {
    //     System.out.println("Animals can't talk");
    // }
    public abstract void talk();
    public void walk() {
        System.out.println("Walking.");
    }
}

interface behaviour {
    void eat();
}

class Cow extends Animal implements behaviour {
    public void talk() {
        // super.talk();
        System.out.println("Moo!");
    }

    @Override
    public void eat() {
        System.out.println("Eat!");
    }
}

class Pig extends Animal {
    public void talk() {
        System.out.println("Grunt!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Cow cow = new Cow();
        // cow.talk();
        // cow.eat();
        // cow.walk();
        behaviour b = new Cow();
        b.eat();
        System.out.println(b.getClass());
        System.out.println(b.getClass().getName());
        System.out.println(b instanceof Cow);
    }
}