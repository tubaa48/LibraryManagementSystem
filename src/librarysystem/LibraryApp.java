package librarysystem;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Kütüphane Yönetim Sistemi ---");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. Kitap Ara");
            System.out.println("4. Kitap Ödünç Al");
            System.out.println("5. Kitap İade Et");
            System.out.println("6. Çıkış");
            System.out.println("7. Ödünç Alınan Kitapları Listele");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // satır boşluğunu temizle

            switch (secim) {
                case 1:
                    System.out.print("Kitap Adı: ");
                    String title = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Aranacak Kitap: ");
                    String search = scanner.nextLine();
                    Book found = library.findBook(search);
                    if (found != null) {
                        System.out.println("Bulundu: " + found);
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;
                case 4:
                    System.out.print("Ödünç alınacak kitap adı: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 5:
                    System.out.print("İade edilecek kitap adı: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 6:
                    System.out.println("Program sonlandırılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
                case 7:
                    library.listBorrowedBooks();
                    break;

            }
        }
    }
}
               
        