public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Aleksandr", "Pushkin");
        Author author2 = new Author("Lev", "Tolstoy");

        Book book1 = new Book("Puslan and Lydmila", author1, 1896);
        Book book2 = new Book("War and World", author2, 1862);

        book1.setBookYearRelease(1895);

    }
}