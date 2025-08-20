import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a single student, containing their name and a list of their marks.
 */
class Student {
    private String name;
    private ArrayList<Double> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Getter for the list of marks
    public ArrayList<Double> getMarks() {
        return marks;
    }

    // Adds a mark to the student's list of marks
    public void addMark(double mark) {
        this.marks.add(mark);
    }

    // Calculates the average of the student's marks
    public double getAverageMark() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
}

/**
 * The main class for the Student Grade Management System.
 * Handles user interaction and manages the list of students.
 */
public class studentmanagment {

    // An ArrayList to store all the Student objects
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * The main method which serves as the entry point for the program.
     */
    public static void main(String[] args) {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-6): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayStudents();
                    break;
                case "3":
                    calculateStudentAverage();
                    break;
                case "4":
                    calculateClassAverage();
                    break;
                case "5":
                    findTopStudent();
                    break;
                case "6":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close(); // Close the scanner before exiting
                    return; // Exit the main method, terminating the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    /**
     * Prints the main menu of options for the user.
     */
    public static void displayMenu() {
        System.out.println("\n--- Student Grade Manager ---");
        System.out.println("1. Add a new student and their marks");
        System.out.println("2. Display all students and their marks");
        System.out.println("3. Calculate a specific student's average mark");
        System.out.println("4. Calculate the class average");
        System.out.println("5. Find the top-performing student");
        System.out.println("6. Exit");
        System.out.println("-----------------------------");
    }

    /**
     * Adds a new student and their marks to the 'students' list.
     */
    public static void addStudent() {
        System.out.println("\n--- Add New Student ---");
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine().trim();

        // Check if student already exists (case-insensitive)
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Error: A student named '" + name + "' already exists.");
                return;
            }
        }

        Student newStudent = new Student(name);

        while (true) {
            System.out.print("En1ter a mark (or type 'done' to finish): ");
            String markInput = scanner.nextLine().trim().toLowerCase();

            if (markInput.equals("done")) {
                if (newStudent.getMarks().isEmpty()) {
                    System.out.println("Warning: No marks entered for this student.");
                }
                break;
            }

            try {
                double mark = Double.parseDouble(markInput);
                if (mark >= 0 && mark <= 100) {
                    newStudent.addMark(mark);
                } else {
                    System.out.println("Invalid input: Please enter a mark between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid number or 'done'.");
            }
        }
        students.add(newStudent);
        System.out.println("\nSuccessfully added '" + name + "' with " + newStudent.getMarks().size() + " marks.");
    }

    /**
     * Displays all students and their marks in a formatted way.
     */
    public static void displayStudents() {
        System.out.println("\n--- List of All Students ---");
        if (students.isEmpty()) {
            System.out.println("No students have been added yet.");
            return;
        }

        for (Student student : students) {
            StringBuilder marksStr = new StringBuilder();
            if (student.getMarks().isEmpty()) {
                marksStr.append("No marks yet");
            } else {
                for (int i = 0; i < student.getMarks().size(); i++) {
                    marksStr.append(student.getMarks().get(i));
                    if (i < student.getMarks().size() - 1) {
                        marksStr.append(", ");
                    }
                }
            }
            System.out.printf("Name: %-20s Marks: %s%n", student.getName(), marksStr.toString());
        }
    }

    /**
     * Calculates and displays the average mark for a specific student.
     */
    public static void calculateStudentAverage() {
        System.out.println("\n--- Calculate Student Average ---");
        if (students.isEmpty()) {
            System.out.println("No students have been added yet.");
            return;
        }

        System.out.print("Enter the name of the student: ");
        String nameToFind = scanner.nextLine().trim();

        Student studentFound = null;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(nameToFind)) {
                studentFound = s;
                break;
            }
        }

        if (studentFound != null) {
            if (studentFound.getMarks().isEmpty()) {
                System.out.println("'" + studentFound.getName() + "' has no marks to calculate an average from.");
            } else {
                System.out.printf("The average mark for %s is: %.2f%n", studentFound.getName(), studentFound.getAverageMark());
            }
        } else {
            System.out.println("Error: Student '" + nameToFind + "' not found.");
        }
    }

    /**
     * Calculates the average mark across all students in the class.
     */
    public static void calculateClassAverage() {
        System.out.println("\n--- Calculate Class Average ---");
        if (students.isEmpty()) {
            System.out.println("No students have been added yet.");
            return;
        }

        ArrayList<Double> allMarks = new ArrayList<>();
        for (Student student : students) {
            allMarks.addAll(student.getMarks());
        }

        if (allMarks.isEmpty()) {
            System.out.println("There are no marks recorded for any student to calculate a class average.");
        } else {
            double sum = 0;
            for (double mark : allMarks) {
                sum += mark;
            }
            double classAverage = sum / allMarks.size();
            System.out.printf("The overall class average is: %.2f%n", classAverage);
        }
    }

    /**
     * Finds and displays the student with the highest average mark.
     */
    public static void findTopStudent() {
        System.out.println("\n--- Top Performing Student ---");
        if (students.isEmpty()) {
            System.out.println("No students have been added yet.");
            return;
        }

        Student topStudent = null;
        double highestAverage = -1.0;

        for (Student student : students) {
            if (!student.getMarks().isEmpty()) {
                double average = student.getAverageMark();
                if (average > highestAverage) {
                    highestAverage = average;
                    topStudent = student;
                }
            }
        }

        if (topStudent != null) {
            System.out.printf("The top student is '%s' with an average of %.2f.%n", topStudent.getName(), highestAverage);
        } else {
            System.out.println("Could not determine the top student as no students have marks.");
        }
    }
}

