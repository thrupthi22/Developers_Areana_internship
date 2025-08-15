import java.util.Scanner;
public class scannerIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();
    }
}
