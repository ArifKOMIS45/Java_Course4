package Odevler.odevEncapsulation5;

public class Book {
    private String bookName, authorName;

    public Book(String bookName, String authorName) {
        setBookName(bookName);
        setAuthorName(authorName);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + "'";
    }
}
