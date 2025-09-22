import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate ignored

        // Iterate
        for (int n : numbers) {
            System.out.println(n);
        }

        // Check membership
        if (numbers.contains(20)) {
            System.out.println("20 exists in the set.");
        }
    }
}
