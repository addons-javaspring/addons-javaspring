package dao.model;

public class Test {
  private Book book;

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  @Override
  public String toString() {
    return "Test [book=" + book + "]";
  }
}
