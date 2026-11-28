import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private List<Book> bookList;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.bookList = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void updateBook(Book book, String status) {
        book.updateStatus(status);
    }

    public void searchBook() {
    }

    public void viewAvailableBooks() {
    }
}