public class Book {
    private int bookID;
    private String title;
    private String author;
    private String category;
    private String status;

    public Book(int bookID, String title,
                String author, String category,
                String status) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public String getBookDetails() {
        return title + " - " + author;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public boolean checkAvailability() {
        return status.equalsIgnoreCase("Available");
    }
}