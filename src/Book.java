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
}
