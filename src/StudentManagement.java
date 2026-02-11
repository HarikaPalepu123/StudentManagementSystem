<<<<<<< HEAD
import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Harika", 85.5));
        list.add(new Student(1, "Anu", 90.0));
        list.add(new Student(2, "Sri", 78.5));

        System.out.println("Original List:");
        display(list);

        Collections.sort(list, new IdComparator());
        System.out.println("\nSorted by ID:");
        display(list);

        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        display(list);

        Collections.sort(list, new MarksComparator());
        System.out.println("\nSorted by Marks:");
        display(list);
    }

    public static void display(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
} 
=======
import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Harika", 85.5));
        list.add(new Student(1, "Anu", 90.0));
        list.add(new Student(2, "Sri", 78.5));

        System.out.println("Original List:");
        display(list);

        Collections.sort(list, new IdComparator());
        System.out.println("\nSorted by ID:");
        display(list);

        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        display(list);

        Collections.sort(list, new MarksComparator());
        System.out.println("\nSorted by Marks:");
        display(list);
    }

    public static void display(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
} 
>>>>>>> 00557d0d0c4324bd8edb72bc1d7d63a353128bee
