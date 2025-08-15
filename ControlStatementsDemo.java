import java.util.Scanner;
public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-Else Example
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        // Switch Example
        System.out.print("Enter a grade (A/B/C): ");
        char grade = sc.next().toUpperCase().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Needs Improvement");
        }

        // For Loop Example
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While Loop Example
        int i = 1;
        System.out.println("Numbers from 1 to 5 using while loop:");
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        sc.close();
    }
}
