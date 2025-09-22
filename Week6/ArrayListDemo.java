import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements
        System.out.println("First name: " + names.get(0));

        // Iterate using for-each
        for (String name : names) {
            System.out.println(name);
        }

        // Remove element
        names.remove("Bob");
        System.out.println("After removal: " + names);
    }
}
