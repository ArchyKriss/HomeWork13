import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int bookYearRelease;

    public Book(String bookName, Author author, int bookYearRelease){
        this.bookName = bookName;
        this.author = author;
        this.bookYearRelease = bookYearRelease;
    }
    public String getBookName(){
        return bookName;
    }
    public Author getAuthor(){
        return author;
    }
    public int getBookYearRelease(){
        return bookYearRelease;
    }
    public void setBookYearRelease(int bookYearRelease){
        this.bookYearRelease = bookYearRelease;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", bookYearRelease=" + bookYearRelease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYearRelease == book.bookYearRelease && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, bookYearRelease);
    }
}
