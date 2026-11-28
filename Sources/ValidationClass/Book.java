public class Book {

    private int bookID;
    private String title;
    private String author;
    private String category;
    private String status;

    public Book(int bookID, String title, String author, String category) {
        if (bookID <= 0)
            throw new IllegalArgumentException("Invalid book ID.");

        this.bookID = bookID;
        setTitle(title);
        setAuthor(author);
        setCategory(category);
        this.status = "Available";
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be empty.");
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be empty.");
        this.author = author;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty())
            throw new IllegalArgumentException("Category cannot be empty.");
        this.category = category;
    }

    public void updateStatus(String status) {
        if (!"Available".equalsIgnoreCase(status) &&
            !"Borrowed".equalsIgnoreCase(status) &&
            !"Reserved".equalsIgnoreCase(status))
            throw new IllegalArgumentException("Invalid book status.");

        this.status = status;
    }

    public boolean checkAvailability() {
        return status.equalsIgnoreCase("Available");
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}