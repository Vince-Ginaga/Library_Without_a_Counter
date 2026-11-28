import java.util.ArrayList;
import java.util.List;

public class Library {

    private String libraryName;
    private List<Book> bookList;

    public Library(String libraryName) {
        if (libraryName == null || libraryName.trim().isEmpty())
            throw new IllegalArgumentException("Library name cannot be empty.");

        this.libraryName = libraryName;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Book cannot be null.");

        for (Book existing : bookList) {
            if (existing.getBookID() == book.getBookID())
                throw new IllegalArgumentException("Book already exists.");
        }

        bookList.add(book);
    }

    public void removeBook(int bookID) {
        if (bookID <= 0)
            throw new IllegalArgumentException("Invalid book ID.");

        boolean removed = bookList.removeIf(book -> book.getBookID() == bookID);

        if (!removed)
            throw new IllegalArgumentException("Book not found.");
    }

    public void updateBook(int bookID, Book updatedBook) {
        if (bookID <= 0 || updatedBook == null)
            throw new IllegalArgumentException("Invalid book information.");

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookID() == bookID) {
                if (updatedBook.getBookID() != bookID)
                    throw new IllegalArgumentException("Book ID cannot be changed.");

                bookList.set(i, updatedBook);
                return;
            }
        }

        throw new IllegalArgumentException("Book not found.");
    }

    public void searchBook(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Search title cannot be empty.");

        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title))
                System.out.println(book.getTitle());
        }
    }

    public void viewAvailableBooks() {
        for (Book book : bookList) {
            if (book.checkAvailability())
                System.out.println(book.getTitle());
        }
    }
}