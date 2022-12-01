package dao.controller;

import java.util.List;

import dao.model.Book;
import dao.model.Test;
import dao.repository.BookRepository;
import dao.repository.TestRepository;

public class Main {
  public static void main(String[] args) {
    BookRepository bookRepository = new BookRepository();
    TestRepository testRepository = new TestRepository();

    List<Book> books;
    List<Test> tests;

    Book book = new Book("Harry Potter 1", "JK Rowling", "Gramedia");
    bookRepository.save(book);

    Test test = new Test();
    test.setBook(book);
    testRepository.save(test);

    book = new Book("Orang Orang Project", null, "Gramedia");
    bookRepository.save(book);

    test.setBook(book);
    testRepository.save(test);

    books = bookRepository.findAll();
    tests = testRepository.findAll();

    // for (Book element : books) {
    // System.out.println(element.getTitle());
    // }

    System.out.println(books);
    System.out.println(tests);
    // [
    // {
    // book: {
    // title: "judul",
    // author: "pengarang",
    // publisher: "penerbit"
    // }
    // },
    // {
    // book: {
    // title: "judul",
    // author: "pengarang",
    // publisher: "penerbit"
    // }
    // }
    // ]
  }
}
