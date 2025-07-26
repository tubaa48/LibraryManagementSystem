package librarysystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")" +
               (isBorrowed ? " - [Ödünç Alındı]" : " - [Mevcut]");
    }
}
