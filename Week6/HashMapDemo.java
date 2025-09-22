import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        // Access values
        System.out.println("Student with ID 2: " + students.get(2));

        // Iterate using forEach
        students.forEach((id, name) -> {
            System.out.println("ID: " + id + ", Name: " + name);
        });

        // Remove by key
        students.remove(3);
        System.out.println("After removal: " + students);
    }
}
