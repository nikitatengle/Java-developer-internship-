import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("   LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Display Books");
            System.out.println("4. Display Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, title, author);

                    library.addBook(book);

                    break;

                case 2:

                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();

                    User user = new User(userId, name);

                    library.addUser(user);

                    break;

                case 3:

                    library.displayBooks();

                    break;

                case 4:

                    library.displayUsers();

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();

                    library.issueBook(issueBookId, issueUserId);

                    break;

                case 6:

                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId);

                    break;

                case 7:

                    System.out.println("Thank you for using Library Management System.");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
