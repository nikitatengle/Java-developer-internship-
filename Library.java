import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Add a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered successfully.");
    }

    // Display all books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n----- BOOK LIST -----");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Display all users
    public void displayUsers() {

        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }

        System.out.println("\n----- USER LIST -----");

        for (User user : users) {
            user.displayUser();
        }
    }

    // Find book by ID
    private Book findBook(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Find user by ID
    private User findUser(int userId) {

        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }

        return null;
    }

    // Issue book
    public void issueBook(int bookId, int userId) {

        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.issueBook();

        System.out.println(
            "Book '" + book.getTitle() +
            "' issued to " + user.getName() + "."
        );
    }

    // Return book
    public void returnBook(int bookId) {

        Book book = findBook(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("This book is already available.");
            return;
        }

        book.returnBook();

        System.out.println(
            "Book '" + book.getTitle() +
            "' returned successfully."
        );
    }
}
