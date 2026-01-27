package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int limit) {
        books = new Book[limit];
        bookCount = 0;
    }

    public void addBook(String bookName, String author) {

        if (bookCount == books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            Book book = new Book(bookName, author);
            books[bookCount++] = book;
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private class Book {

        final String bookName;
        final String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + bookName + ", 저자: " + author;
        }
    }
}
