public class Student extends Person {
    private String course;

    public Student() {
        super();
        this.course = "Empty Course";
    }

    public Student(String name, String dateOfBirth, String course) {
        super(name, dateOfBirth);
        this.course = course;
    }

    @Override
    public String toString() {
        // System.out.println("I am " + super.getName() + ", my birthday is " + super.getDateOfBirth() + ", my course is " + this.course + ".");
        // System.out.println("I am " + super.getName() + ", my birthday is " + super.getDateOfBirth());
        return (super.toString() + ("My course is " + this.course));
    }
}
