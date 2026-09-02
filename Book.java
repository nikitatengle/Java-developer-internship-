public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Issue book
    public void issueBook() {
        issued = true;
    }

    // Return book
    public void returnBook() {
        issued = false;
    }

    // Display book information
    public void displayBook() {
        System.out.println(
            "Book ID: " + bookId +
            " | Title: " + title +
            " | Author: " + author +
            " | Status: " + (issued ? "Issued" : "Available")
        );
    }
}