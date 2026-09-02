import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {

    // Private fields - Encapsulation
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Marks
    public double getMarks() {
        return marks;
    }

    // Setter for Marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display student details
    public void displayStudent() {
        System.out.println(
            "ID: " + id +
            " | Name: " + name +
            " | Marks: " + marks
        );
    }
}


// Main class
public class StudentRecordManagement {

    // ArrayList to store Student objects
    static ArrayList<Student> students = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);


    // Add Student
    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Check duplicate ID
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(id, name, marks);

        // Add student to ArrayList
        students.add(student);

        System.out.println("Student added successfully!");
    }


    // View Students
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n========== STUDENT RECORDS ==========");

        for (Student student : students) {
            student.displayStudent();
        }

        System.out.println("=====================================");
    }


    // Update Student
    public static void updateStudent() {

        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new marks: ");
                double newMarks = scanner.nextDouble();

                // Update student details
                student.setName(newName);
                student.setMarks(newMarks);

                System.out.println("Student record updated successfully!");

                return;
            }
        }

        System.out.println("Student with ID " + id + " not found.");
    }


    // Delete Student
    public static void deleteStudent() {

        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                System.out.println("Student deleted successfully!");

                return;
            }
        }

        System.out.println("Student with ID " + id + " not found.");
    }


    // Main method
    public static void main(String[] args) {

        boolean running = true;

        System.out.println("======================================");
        System.out.println("   STUDENT RECORD MANAGEMENT SYSTEM");
        System.out.println("======================================");

        while (running) {

            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("----------------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println(
                        "Thank you for using Student Record Management System!"
                    );
                    running = false;
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please enter a number between 1 and 5."
                    );
            }
        }

        scanner.close();
    }
}