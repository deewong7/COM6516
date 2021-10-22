public class Tutor extends Person {
    private String officeNo;

    public Tutor(String name, String dateOfBirth, String officeNo) {
        super(name, dateOfBirth)
        this.officeNo = officeNo;
    }

    @Override
    public String toString() {
        return (super.toString() + ("My office number is " + this.officeNo));
    }
}