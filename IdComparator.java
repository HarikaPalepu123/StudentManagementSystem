import java.util.Comparator;

public  class IdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}
