public class TestItemEquals {
    private int id;

    public boolean equal(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            TestItemEquals obj2 = (TestItemEquals) obj;
            return (this.getId() == obj2.getId());
        }
    }

    public int getId() {
        return this.id;
    }
}