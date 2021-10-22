public class Person {
    private String name;
    private String dateOfBirth;

    public Person() {
        this.name = "";
        this.dateOfBirth = "";
    }

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return ("I am " + super.getName() + ", my birthday is " + super.getDateOfBirth());
    }
}
