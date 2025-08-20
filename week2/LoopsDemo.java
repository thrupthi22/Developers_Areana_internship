public class LoopsDemo {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= 5);
    }
}
