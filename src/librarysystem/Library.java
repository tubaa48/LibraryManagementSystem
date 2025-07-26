package librarysystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitap eklendi: " + book);
    }
    public void listBorrowedBooks() {
        boolean found = false;
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ödünç alınmış kitap bulunmuyor.");
        }
    }



    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.toString().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }
    public void borrowBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("Kitap bulunamadı.");
        } else if (book.isBorrowed()) {
            System.out.println("Bu kitap zaten ödünç alınmış.");
        } else {
            book.borrow();
            System.out.println("Kitap ödünç alındı: " + book);
        }
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("Kitap bulunamadı.");
        } else if (!book.isBorrowed()) {
            System.out.println("Bu kitap zaten iade edilmiş.");
        } else {
            book.returnBook();
            System.out.println("Kitap iade edildi: " + book);
        }
    }
}
