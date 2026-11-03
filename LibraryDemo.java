class LibraryBook {
    String title, author;
    double price;
    static int bookCount = 0;
    LibraryBook(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
        bookCount++;
    }
    static void displayBookCount() {
        System.out.println("Total books: " + bookCount);
    }
    void displayBook() {
        System.out.println(title + " by " + author + ", Rs." + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Basics", "James", 450);
        LibraryBook b2 = new LibraryBook("OOP in Java", "Herbert", 550);
        b1.displayBook(); b2.displayBook();
        LibraryBook.displayBookCount();
    }
}
